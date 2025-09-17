package ss4_class_object.codegym_management.view;

import ss4_class_object.codegym_management.entity.Student;

import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void showList(Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            } else {
                break;
            }
        }
    }
    public static Student inputDataForStudent(){
        System.out.println("Thêm mới");
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        return student;
    }
}
