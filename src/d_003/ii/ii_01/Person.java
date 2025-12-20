package d_003.ii.ii_01;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println
            ("Watashi ha " + name + " desu. " + age + " sai desu.");
    }

    int getAge(){
        return this.age;
    }
}

