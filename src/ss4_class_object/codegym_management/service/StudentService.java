package ss4_class_object.codegym_management.service;

import ss4_class_object.codegym_management.entity.Student;
import ss4_class_object.codegym_management.repository.IStudentRepository;
import ss4_class_object.codegym_management.repository.StudentRepository;

public class StudentService implements IStudentService {

 private IStudentRepository studentRepository = new StudentRepository();

    // chức năng
    @Override
    public Student[]  findAll(){
      return studentRepository.findAll();
    }
    public void add (Student student){
        // xử nghiệp vụ
        // ví dụ id tự tặng
       studentRepository.add(student);
    }
    @Override
    public boolean deleteById(int id) {
        return studentRepository.deleteById(id);
    }
}
