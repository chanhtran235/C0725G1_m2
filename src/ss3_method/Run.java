package ss3_method;

import java.util.Arrays;

public class Run {
    int s =10;
    public static void main(String[] args) {
        int[] x ={1,2};
        changeArray(x);
        System.out.println("ngoài: " + Arrays.toString(x));
    }
    public static void changeValue(int a){
        a++;
        System.out.println(a);
    }
    public static void changeArray(int[] arr){
        arr = new int[]{100,1000};
        System.out.println(Arrays.toString(arr));
    }
}
