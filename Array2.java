import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
       int[] array = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0;i<array.length;i++) {
            array[i] = sc.nextInt();
       }
        System.out.println(Arrays.toString(array));
    }
}
