import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }
}
