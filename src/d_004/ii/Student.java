package d_004.ii;

public class Student extends Person{
    int score;

    public Student(String name,int score){
        super(name);
        this.score = score;
    }

    void introduce(){
        System.out.println("Student: " + name + ", score: " + score);
    }
}