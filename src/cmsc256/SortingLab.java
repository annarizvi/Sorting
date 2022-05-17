package cmsc256;

import bridges.connect.Bridges;

import bridges.connect.DataSource;

import bridges.data_src_dependent.ActorMovieIMDB;

import java.util.Collections;

import java.util.List;


public class SortingLab {

//STEP 1

    // In the main method, create the Bridges object replacing

    //  the 2nd & 3rd parameters with

    //  your individual Bridges user id and API key

    public static void main(String[] args) {


        Bridges bridges = new Bridges(5, "rizviab", "412047047516");

        DataSource ds = bridges.getDataSource();

        List<ActorMovieIMDB> movieData = null;

        try {

            movieData = ds.getActorMovieIMDBData();

        } catch (Exception e) {

            System.out.println("Unable to connect to Bridges.");

        }


        for (int i = 0; i < 5; i++) {

            ActorMovieIMDB entry = movieData.get(i);

            System.out.println("" + i + ".  " + entry.getActor() + " was in " + entry.getMovie());

        }

        //STEP 2


        for (ActorMovieIMDB Actor : movieData) {

            if (Actor.getMovie().equals("Being_John_Malkovich_(1999)")) {
                System.out.println(Actor.getActor());
            }


        }

        System.out.println();


        Collections.sort(movieData, new ActorComparator());

                for(int i = 0; i < movieData.size() - 1; i++) {

                    ActorMovieIMDB entry = movieData.get(i);
                    if(entry.getMovie().equals("Being_John_Malkovich_(1999)")) {
                        System.out.println(entry.getActor());
                    }

                }











        }
    }
