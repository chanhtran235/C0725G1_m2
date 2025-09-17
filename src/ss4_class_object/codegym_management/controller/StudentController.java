package ss4_class_object.codegym_management.controller;

import ss4_class_object.codegym_management.entity.Student;
import ss4_class_object.codegym_management.service.IStudentService;
import ss4_class_object.codegym_management.service.StudentService;
import ss4_class_object.codegym_management.view.StudentView;

import java.util.Scanner;

public class StudentController {

    private static IStudentService studentManager = new StudentService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("=== Quản lý sinh viên===" +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Quay về menu chính");
            System.out.println("--Chọn chức năng---");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách");
                    Student[] students = studentManager.findAll();
                    // hiển thị
                    StudentView.showList(students);
                    break;
                case 2:
                    Student student = StudentView.inputDataForStudent();
                    studentManager.add(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Xoá");
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
}
