package ss11_generic;

import ss4_class_object.codegym_management.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(); // Object
//        list.add(new Student());
//        list.get(0).getScore();
//        Box<Integer> box = new Box<>();
//        box.setT(1);
        Box<Student> box1 = new Box<>();
        box1.setT(new Student());
        box1.method1(new Student());
    }
}
