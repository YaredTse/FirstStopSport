package Enums;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String... args ){

        System.out.println();
        System.out.println( " * * * * * * * * * Application * * * * * * * * * ");
        System.out.println();
        ListOfTeams listOfTeams = ListOfTeams.ARSENAL;
        System.out.println( listOfTeams ); //  => ARSENAL
        System.out.println( );

        List<ListOfTeams> listOfTeamses = Arrays.asList( ListOfTeams.values() );
        for ( ListOfTeams l : listOfTeamses ) {
            l.defaultMethod();
        }

    }
}
