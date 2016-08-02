package Enums;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Arrays;
import java.util.List;

public class Application implements InterA {

    String name_one;
    String name_two;
    String name_three;

    public void testA(){
        System.out.println("Hello");
    }

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

        Application a = new Application();
        System.out.println( a );
    }

    @Override public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
