package ss4_class_object.codegym_management.repository;

import ss4_class_object.codegym_management.entity.Student;

public class StudentRepository implements IStudentRepository {

    private static Student[] students = new Student[100];
    static {
        students[0]= new Student(1,"chánh");
        students[1]= new Student(2,"hải");
    }
    // chức năng
    @Override
    public Student[]  findAll(){
        // dọc file
        return students;
    }
    public void add (Student student){
        // ghi file
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i]= student;
                break;
            }
        }
    }
    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
