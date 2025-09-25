package ss4_class_object.codegym_management.service;

import ss4_class_object.codegym_management.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();
    void add (Student student);
    boolean deleteById(int id);
}
