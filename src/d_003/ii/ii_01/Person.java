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
        if(this.age < 20){
            System.out.println("未成年です");
        }else{
            System.out.println("成人です");
        }
    }

    int getAge(){
        return this.age;
    }
}

