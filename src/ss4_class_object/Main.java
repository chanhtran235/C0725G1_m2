package ss4_class_object;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("=== Quản lý sinh viên===" +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Thoát");
            System.out.println("--Chọn chức năng---");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách");
                    Student[] students = studentManager.findAll();
                    // hiển thị
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            System.out.println(students[i]);
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    studentManager.add(student);
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
