package ss4_class_object.codegym_management.view;

import ss4_class_object.codegym_management.entity.Student;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void showList(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    public static Student inputDataForStudent(){
        System.out.println("Thêm mới");
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm");
        float score = Float.parseFloat(scanner.nextLine());
        Student student = new Student(id, name,score);
        return student;
    }
    public static int inputId(){
        System.out.println("nhập id");
        return Integer.parseInt(scanner.nextLine());
    }
}
