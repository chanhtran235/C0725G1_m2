package ss4_class_object.codegym_management.service;

import ss4_class_object.codegym_management.entity.Student;

public interface IStudentService {

    Student[] findAll();
    void add (Student student);
    boolean deleteById(int id);
}
