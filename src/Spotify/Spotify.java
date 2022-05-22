package Spotify;

import Spotify.premium.Subscriber;
import Spotify.content.Episodes;
import Spotify.content.Songs;
import Spotify.content.Podcasts;

import Services.SubscriberServices;
import Services.EpisodesServices;
import Services.SongsServices;
import Services.PodcastsServices;
import Services.AuditServices;

import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class Spotify {
        /*
        public static void main(String[] args) throws IOException {

            SubscriberServices subscriberServices = new SubscriberServices();
            SongsServices songsServices = new SongsServices();
            PodcastsServices podcastsServices = new PodcastsServices();
            EpisodesServices episodesServices = new EpisodesServices();
            Scanner scanner = new Scanner(System.in);

            ArrayList<Subscriber> subscribers = SubscriberServices.getAllSubscribers();
            ArrayList<Songs> songs = SongsServices.getAllSongs();
            ArrayList<Podcasts> podcasts = PodcastsServices.getAllPodcasts();
            Map<Integer, Episodes> episodesMap = EpisodesServices.getAllEpisodesAsMap();


            System.out.println("Welcome to spotify! You can choose one of the below opts: \n");

            while(true) {
                System.out.println();
                System.out.println("1. Show menu");
                System.out.println("2. Add");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Your opt is: ");
                String opt = scanner.nextLine();
                switch(opt) {
                    case "5" : {
                        System.out.println("See you soon!");
                        System.exit(5);
                    }
                    case "1" : {
                        int opt = 1;
                        while (opt == 1) {
                            System.out.println();
                            System.out.println("1. Show all Subscribers");
                            System.out.println("2. Show all Songs");
                            System.out.println("3. Show all Podcasts available");
                            System.out.println("4. Show all Episodes available from all Podcasts");
                            System.out.println("5. EXIT");
                            System.out.print("Waiting for user's chioce: ");
                            String displayopt = scanner.nextLine();
                            switch (displayopt) {
                                case "5": {
                                    opt = 0;
                                    break;
                                }
                                case "1": {
                                    for (Subscriber sub : subscribers) {
                                        System.out.println(sub);
                                    }
                                    AuditServices.addActionInAudit("Print all subscribers from the database");
                                    System.out.println("Continue by pressing enter!");
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "2": {
                                    for (Songs song : songs) {
                                        System.out.println(song);
                                    }
                                    AuditServices.addActionInAudit("Print all songs from the database");
                                    System.out.println("Continue by pressing enter!");
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "3": {
                                    for (Podcasts pod : podcasts) {
                                        System.out.println(pod);
                                    }
                                    AuditServices.addActionInAudit("Print all podcasts from the database");
                                    System.out.println("Continue by pressing enter!");
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "4": {
                                    for (Map.Entry<Integer, Episodes> me : episodesMap.entrySet()) {
                                        System.out.println(me.getKey() + ". " + me.getValue());
                                    }

                                    AuditServices.addActionInAudit("Print all episodes from the database");
                                    System.out.println("Continue by pressing enter!");
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                default: {
                                    System.out.println("YOU CAN ONLY CHOOSE AN opt FROM 1 TO 5!");
                                }
                            }
                        }
                        break;
                    }
                    case "2" : {
                        int opt = 1;
                        while (opt == 1) {
                            System.out.println();
                            System.out.println("1. Register as an existing subscriber");
                            System.out.println("2. Add a new podcast");
                            System.out.println("3. Add a new song");
                            System.out.println("4. EXIT");
                            System.out.println("Waiting user's chioce: ");
                            String addopt = scanner.nextLine();
                            switch (addopt) {
                                case "4" : {
                                    opt = 4;
                                    break;
                                }
                                case "1" : {
                                    SubscriberServices.register(SubscriberServices.register(scanner));
                                    AuditServices.addActionInAudit("Add a subscriber");
                                    subscribers = SubscriberServices.getAllSubscribers();
                                    System.out.println("ENTER");
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "2" : {
                                    PodcastsServices.insertPodcast(PodcastsServices.insertPodcast(scanner));
                                    AuditServices.addActionInAudit("Add a new podcast");
                                    System.out.println("ENTER");
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "3" : {
                                    SongsServices.insertSong(SongsServices.insertSong(scanner));
                                    AuditServices.addActionInAudit("Add a new song");
                                    System.out.println("ENTER");
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                default: {
                                    System.out.println("YOU CAN ONLY CHOOSE AN opt FROM 1 TO 4!");
                                }
                            }
                        }
                        break;
                    }
                    case "3" : {
                        int opt = 1;
                        while (opt == 1) {
                            System.out.println();
                            System.out.println();
                            System.out.println("1. Update a podcast");
                            System.out.println("2. Update an episode");
                            System.out.println("3. EXIT");
                            System.out.println("Waiting user's chioce: ");
                            String updateopt = scanner.nextLine();
                            switch (updateopt) {
                                case "3" : {
                                    opt = 3;
                                    break;
                                }
                                case "1" : {
                                    PodcastsServices.updatePodcast(podcasts, scanner);
                                    AuditServices.addActionInAudit("Update a podcast");
                                    System.out.println("ENTER");
                                    podcasts = PodcastsServices.getAllPodcasts();
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "2" : {
                                    EpisodesServices.updateEpisode(episodes, scanner);
                                    AuditServices.addActionInAudit("Update an episode");
                                    System.out.println("ENTER");
                                    podcasts = PodcastsServices.getAllEpisodes();
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                default : {
                                    System.out.println("YOU CAN ONLY CHOOSE AN opt FROM 1 TO 3!");
                                }
                            }
                        }
                        break;
                    }
                    case "4" : {
                        int opt = 1;
                        while (opt == 1) {
                            System.out.println();
                            System.out.println();
                            System.out.println("1. Delete a song");
                            System.out.println("2. Delete a podcast");
                            System.out.println("3. Delete an episode");
                            System.out.println("4. EXIT");
                            System.out.print("Waiting for user's choice: ");
                            String updateopt = scanner.nextLine();
                            switch (updateopt) {
                                case "4" : {
                                    opt = 4;
                                    break;
                                }
                                case "1" : {
                                    SongsServices.deleteSong(songs, scanner);
                                    AuditServices.addActionInAudit("Delete a song");
                                    System.out.println("ENTER");
                                    songs = SongsServices.getAllSongs();
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "2" : {
                                    PodcastsServices.deletePodcast(podcasts, scanner);
                                    AuditServices.addActionInAudit("Delete a podcast");
                                    System.out.println("ENTER");
                                    podcasts = PodcastsServices.getAllPodcasts();
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                case "3" : {
                                    EpisodesService.deleteEpisode(episodes, scanner);
                                    AuditServices.addActionInAudit("Delete an episode");
                                    System.out.println("ENTER");
                                    episodes = restaurantService.getAllRestaurants();
                                    String aux = scanner.nextLine();
                                    break;
                                }
                                default : {
                                    System.out.println("YOU CAN ONLY CHOOSE AN opt FROM 1 TO 4!");
                                }
                            }
                        }
                        break;
                    }
                    default : {
                        System.out.println("YOU CAN ONLY CHOOSE AN opt FROM 1 TO 4!");
                    }
                }
            }
        }
        */
}
