package ss15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("---------Start-------");
//        readFile("src/ss15/student1.txt");
//        getElement();
        int age = Integer.parseInt(scanner.nextLine());
        try {
            boolean check = checkAge(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------End---------");
    }

    public static void getElement() {
        System.out.println("-----nhập vị trí cần lấy--------");
        int[] array = {10, 20, 30};
        int index;
        try {
            index = Integer.parseInt(scanner.nextLine());
            System.out.println(array[index]);
        } catch (NumberFormatException e) {
            System.out.println("lỗi do nhập chữ");
            System.out.println(e.getMessage());
            index = 0;
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("truy cập ngoài pt mảng");
            index = array.length - 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally luôn chạy");
        }
    }

    public static void readFile(String filePath) {

        File file = new File(filePath);
        FileReader fileReader = null;
        try(FileReader fileReader1 = new FileReader(file)) {
            // code
        }catch (IOException e){

        }

    }
    public static boolean checkAge(int age) throws AgeException {
        if (age<0){
            throw new AgeException("tuổi nhỏ hơn 0");
        } else if (age>200) {
            throw new AgeException("tuổi  lớn hơn 200");
        }else {
            return true;
        }
    }
}
