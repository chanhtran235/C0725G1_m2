package ss4_class_object.codegym_management.entity;

public class Student extends Person {
    private float score;
    public static String school = "Codegym";
    public Student(){

    }
    public Student(int id, String name) {
        super(id, name);
    }
    public Student(int id, String name, float score) {
        super(id, name);
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                ", score :" + score +
                '}';
    }
}
