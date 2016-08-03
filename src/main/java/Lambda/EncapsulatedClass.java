package Lambda;

public class EncapsulatedClass {

    private String name;
    private int age;
    private String surName;
    private boolean active;


    public EncapsulatedClass( String n, int a, String sn ) {
        if( n == null || a == 0 || sn == null )
            throw new IllegalArgumentException();

        this.name = n;
        this.age = a;
        this.surName = sn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurName() {
        return surName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public static void main(String[] args){
        EncapsulatedClass encapsulatedClass = new EncapsulatedClass("test", 12, "another tester");
        encapsulatedClass.name = "sdfsdf";
        System.out.println(encapsulatedClass.name);
    }
}
