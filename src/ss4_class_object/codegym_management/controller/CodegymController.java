package ss4_class_object.codegym_management.controller;

import java.util.Scanner;

public class CodegymController {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("=== Quản lý codegym ===" +
                    "\n 1. Quản lý sinh viên" +
                    "\n 2. Quản lý giáo viên" +
                    "\n 3. Quản lý gì đó" +
                    "\n 4. Thoát");
            System.out.println("--Chọn chức năng---");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentController.showMenu();
                    // hiển thị
                    break;
                case 2:
                    TeacherController.showMenu();
                    break;
                case 3:
                    System.out.println("Chức năng mở rộng");
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
}
