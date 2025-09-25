package ss4_class_object.codegym_management.service;

import ss4_class_object.codegym_management.entity.Student;
import ss4_class_object.codegym_management.repository.IStudentRepository;
import ss4_class_object.codegym_management.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {

 private IStudentRepository studentRepository = new StudentRepository();

    // chức năng
    @Override
    public List<Student> findAll(){
      return studentRepository.findAll();
    }
    public void add (Student student){
        // xử nghiệp vụ
        // ví dụ id tự tặng
        List<Student> studentList = studentRepository.findAll();
        if (studentList.isEmpty()){
            student.setId(1);
        }else {
            Student endStudent = studentList.get(studentList.size()-1);
            student.setId(endStudent.getId()+1);
        }

       studentRepository.add(student);
    }
    @Override
    public boolean deleteById(int id) {
        // kiểm trả xem có id không?
        Student student = studentRepository.findById(id);
        if (student==null){
            return false;
        }
        return studentRepository.deleteById(id);
    }
}
