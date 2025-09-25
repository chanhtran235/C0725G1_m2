package ss4_class_object.codegym_management;

import ss4_class_object.codegym_management.entity.Student;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // tạo list kiểu Student
        List<Student> studentList = new ArrayList<>();
        // thêm phần tử vào list
        studentList.add(new Student(1, "Nguyễn Văn A", 9.5f));
        studentList.add(new Student(2, "Nguyễn Văn B", 8.5f));
        studentList.add(new Student(3, "Nguyễn Văn C", 7.5f));
        studentList.add(new Student(4, "Nguyễn Văn D", 6.5f));
        studentList.add(new Student(5, "Nguyễn Văn E", 5.5f));
        // in danh sách sinh viên
        for (Student student : studentList) {
            System.out.println(student);
        }
        // delete student by id = 3
        studentList.removeIf(student -> student.getId() == 3);
        System.out.println("Danh sách sinh viên sau khi xóa:");
        for (Student student : studentList) {
            System.out.println(student);
        }
        // tìm kiếm sinh viên theo tên
        String name = "Nguyễn Văn B";
        // fillter student by name with stream
        List<Student> studentListByName = studentList.stream().filter(student -> student.getName().equals(name)).toList();


    }

}
