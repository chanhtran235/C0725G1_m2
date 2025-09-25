package ss4_class_object.codegym_management.repository;

import ss4_class_object.codegym_management.entity.Student;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    boolean add (T t);
    boolean deleteById(int id);
    T findById(int id);
}
