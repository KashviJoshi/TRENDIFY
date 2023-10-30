# TRENDIFY- GitHub Trending Repositories Viewer
Trendify is a lightweight, cross-platform application that lets you explore the latest trending repositories on GitHub.Discover the hottest repositories and trends on GitHub with our Trending Repositories Application.Stay up-to-date with the latest tech trends, star your favorite repositories, and contribute to the world of open-source development. Trendify offers an intuitive interface for viewing repository details, READMEs, and more.

# App Architecture
Based on mvvm architecture and repository pattern.

![3](https://github.com/KashviJoshi/TRENDIFY-/assets/116963136/f55cb949-c876-4044-8b30-8d79f5a66caf)

# Key Features:
Browse and search trending repositories on GitHub.

Explore repositories by programming language , time and topic.

Simple and responsive user interface.

Real-time synchronization with GitHub Trends.

![1](https://github.com/KashviJoshi/TRENDIFY/assets/116963136/68eeaa00-f80f-4b10-b22f-8e02967b093c)

![2](https://github.com/KashviJoshi/TRENDIFY/assets/116963136/7cfadb60-a6f7-4eab-9c48-022478fcfd71)



# App Packages
data - contains
  
  api - contains the api classes to make api calls to FreshlyPressed server, using Retrofit.
  
  db - contains the db classes to cache network data.
  
  repository - contains the repository classes, responsible for triggering api requests and saving the response in the database.

di - contains ViewModelkey.

ui - contains classes needed to display Activity.

util - contains classes needed for activity redirection, ui/ux animations.


# App Specs
Minimum SDK 16

Java8 (in master branch) & Kotlin (in kotlin_support branch)

MVVM Architecture

Android Architecture Components (LiveData, Lifecycle, ViewModel, Room Persistence Library, ConstraintLayout)

RxJava2 for implementing Observable pattern.

Dagger 2 for dependency injection.

Retrofit 2 for API integration.

Gson for serialisation.

Okhhtp3 for implementing interceptor, logging and mocking web server.

Mockito for implementing unit test cases

Picasso for image loading.




# Getting Started:
To use Trendify, simply download the application for your platform from the Releases page. For developers, you can also clone this repository and follow the installation instructions in the README file.



# Contributing:
We welcome contributions from the open-source community! Feel free to submit bug reports, feature requests, and pull requests to help improve this application.

*Stay trendy and explore the latest GitHub repositories with Trendify!*




