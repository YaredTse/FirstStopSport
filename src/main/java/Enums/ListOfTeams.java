package Enums;

public enum ListOfTeams {

    ARSENAL(21, "Winner") {
        public void printTeam(){
            System.out.println( " Winner Method" );
        }
    },

    LIVERPOOL(20, "Draw") {
        public void printTeam(){
            System.out.println( " Draw Method" );
        }

        public void defaultMethod(){
            System.out.println( "This is a overides the default  method" );
        }
    },

    CHELSEA( 24, "Loser") {

        public void printTeam(){
            System.out.println( " Loser Method" );
        }

    };

    Integer p;
    String n;

    private ListOfTeams(Integer players , String result){
        this.p = players;
        this.n = result;
    }

    abstract public void printTeam();

    public void defaultMethod(){
        System.out.println( "This is a default method" );
    }
}
