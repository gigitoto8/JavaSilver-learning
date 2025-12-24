package d_004.ii;

public class Person{
    String name;

    public Person(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("Person:" + name);
    }
}