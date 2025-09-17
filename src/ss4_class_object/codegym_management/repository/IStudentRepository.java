package ss4_class_object.codegym_management.repository;

import ss4_class_object.codegym_management.entity.Student;

public interface IStudentRepository {
    Student[] findAll();
    void add (Student student);

    boolean deleteById(int id);
}
