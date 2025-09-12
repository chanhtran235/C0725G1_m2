package ss4_class_object;

public class StudentManager {

    private static Student[] students = new Student[100];
    static {
        students[0]= new Student(1,"chánh");
        students[1]= new Student(2,"hải");
    }
    // chức năng
    public Student[]  findAll(){
      return students;
    }
    public void add (Student student){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i]= student;
                break;
            }
        }
    }
}
