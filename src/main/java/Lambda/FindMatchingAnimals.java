package Lambda;

public class FindMatchingAnimals {

    private static void print( Animal animal, CheckTrait checkTrait){
        if( checkTrait.test(animal)){
            System.out.println( animal );
        }
    }

    public static void main(String... args){
        print( new Animal("Fish", false, true), a -> a.canSwim() );
        print( new Animal("kangaroo", true, false), a -> a.canHop() );
    }
}
