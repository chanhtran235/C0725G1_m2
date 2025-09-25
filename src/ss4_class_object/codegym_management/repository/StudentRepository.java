package ss4_class_object.codegym_management.repository;

import ss4_class_object.codegym_management.entity.Student;
import ss4_class_object.codegym_management.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    private final String STUDENT_FILE= "src/ss4_class_object/codegym_management/data/student.csv";
    // chức năng
    @Override
    public List<Student>  findAll(){
        List<Student> studentList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        try {
            stringList = ReadAndWriteFile.readFileCSVToList(STUDENT_FILE);
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        // chuyển stringlist => studentList;
        String[] array;
        for (String line: stringList){
            array = line.split(",");
            Student student = new Student(Integer.parseInt(array[0]),array[1],Float.parseFloat(array[2]));
            studentList.add(student);
        }
        return studentList;
    }
    public boolean add (Student student){
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToSCV());
        // ghi file
        try {
            ReadAndWriteFile.writeListStringToCSV(STUDENT_FILE,stringList,true);
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
            return false;
        }
        return true;
    }
    @Override
    public boolean deleteById(int id) {
        List<Student> studentList = findAll();
        for (int i = 0; i <studentList.size() ; i++) {
            if (id==studentList.get(i).getId()){
                studentList.remove(i);
                break;
            }
        }
        // chuyển đối
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <studentList.size() ; i++) {
            stringList.add(studentList.get(i).getInfoToSCV());
        }
        // ghi đè
        try {
            ReadAndWriteFile.writeListStringToCSV(STUDENT_FILE,stringList,false);
        } catch (IOException e) {
            System.out.println("loi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public Student findById(int id) {
        List<Student> studentList = findAll();
        for(Student student: studentList){
            if (student.getId()==id){
                return student;
            }
        }
        return null;
    }
}
