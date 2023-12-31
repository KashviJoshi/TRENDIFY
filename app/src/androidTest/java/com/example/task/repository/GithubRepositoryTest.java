package com.example.task.repository;

import android.arch.core.executor.testing.InstantTaskExecutorRule;

import com.example.task.data.Resource;
import com.example.task.data.local.dao.GithubDao;
import com.example.task.data.local.entity.GithubEntity;
import com.example.task.data.remote.api.GithubApiService;
import com.example.task.data.remote.model.GithubApiResponse;
import com.example.task.data.repository.GithubRepository;
import com.example.task.util.MockTestUtil;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.observers.TestObserver;

import static com.example.task.AppConstants.QUERY_ORDER;
import static com.example.task.AppConstants.QUERY_SORT;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GithubRepositoryTest {

    @Mock
    GithubDao githubDao;

    @Mock
    GithubApiService githubApiService;

    private GithubRepository repository;

    @Rule
    public InstantTaskExecutorRule instantExecutorRule = new InstantTaskExecutorRule();

    @Before
    public void init() {
        repository = new GithubRepository(githubDao, githubApiService);
    }

    @Test
    public void loadPostsTest() {
        Long page = 1l;

        List<GithubEntity> loadFromDB = MockTestUtil.mockRepositories();
        when(githubDao.getRepositoriesByPage(page))
                .thenReturn(loadFromDB);

        when(githubApiService.fetchRepositories(QUERY_SORT, QUERY_ORDER, page))
                .thenReturn(Observable.empty());

        Observable<Resource<List<GithubEntity>>>
                data = repository.getRepositories(page);
        verify(githubDao).getRepositoriesByPage(page);
        verify(githubApiService).fetchRepositories(QUERY_SORT, QUERY_ORDER, page);

        TestObserver testObserver = new TestObserver();
        data.subscribe(testObserver);
        testObserver.assertNoErrors();
    }
}
