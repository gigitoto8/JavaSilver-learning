package d_003.ii.ii_02;

public class Person {
    String name;
    int age;
    static int count = 0;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        count++;
    }

    void introduce(){
        System.out.println
            ("Watashi ha " + name + " desu. " + age + " sai desu.");
    }
}

