package Enums;

public class Card {

    private String rank;
    private String suit;

    public Card(String str, String s){

        if( str == null || s == null )
            throw new IllegalArgumentException();

        this.rank = str;
        this.suit = s;
    }

    @Override
    public boolean equals(Object obj) {

        if ( !(obj instanceof Card))
            return false;

        Card c = (Card) obj;
        return this.rank.equals(c.rank) && this.suit.equals( c.suit) ;
    }

    @Override
    public int hashCode() {
        return rank.hashCode();
    }
}
