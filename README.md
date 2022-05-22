# Spotify - Advanced Oriented Programming Project

Simulation of the Spotify music app using Java, JDBC and OOP for my second year, second semester at University of Bucharest.

### The simulation has the following Classes:
1. Spotify folder -> premium folder
  - Subscriber
    - CreditCard
    - Plans (standard, duo, individual, family)
2. Spotify folder -> content folder
  - Albums
    - Songs
      - Commands
  - MyPlaylist
    - Podcasts
      - Seasons
        - Episodes
          - Commands
    - Songs
3. ViewMode where each class has an array list with the subscribers
  - DesktopApplication
  - MobileApplication
  - Browser/Web

The entered data in MySQL Workbench can be found in the folder **ReadAndWrite** and the creation of the tables in the database can be found in the folder **SQL Database**.
Class Commands also has the ability to skip, backward, pause, resume a podcast episode or a song from a playlist or an album.

### The simulation also has the below services implemented in Services folder and Repositories folder:
1. Subscriber
  * getAllSubscribers()
  * selectSubscriberDetails(by emailAddress) 
  * selectSubscriber(by emailAddress - only lastName)
  * saveSubscriber/insert
  * deleteSubscriber
  * updateSubscriberInfo(lastName, firstName, password)
2. Song
  * getAllSongs()
  * saveSong/insert
  * deleteSong
  * selectSongs(by title)
3. Podcast
  * getAllPodcasts()
  * savePodcast/insert
  * updatePodcastsNumberOfSeasons(by title)
  * deletePodcasts
4. Episode
  * getAllEpisodes()
  * getAllEpisodesAsMap()
  * saveEpisode/insert
  * deleteEpisodeByTitle(by title)
  * deleteEpisode()
  * updateEpisodeInfo(by numberOfTheEpisode)
