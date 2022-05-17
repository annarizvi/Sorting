package cmsc256;

import bridges.data_src_dependent.ActorMovieIMDB;

import java.util.Comparator;

public class ActorComparator implements Comparator<ActorMovieIMDB> {


    public int compare(ActorMovieIMDB Actor1, ActorMovieIMDB Actor2) {

        return Actor1.getActor().compareTo(Actor2.getActor());


}



}
