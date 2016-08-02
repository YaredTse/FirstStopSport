package Lambda;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal( String speciesName, boolean canHop, boolean canSwim ){
        this.species = speciesName;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public String toString(){
        return species;
    }
}
