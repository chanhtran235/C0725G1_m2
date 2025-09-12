package ss1_tong_quan_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println(format("ADD"));
    }
    public static String format(String o){
      return switch (o){
            case "ADD","abc" ->{
               yield "abc";
            }
            case "Display" ->{
                System.out.println("đsfsfsf");
                yield "efg";
            }
            default -> "not match";

        };
    }
}
