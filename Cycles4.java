import java.util.Scanner;

public class Cycles4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int height = sc.nextInt();
        System.out.println("Enter width");
        int width = sc.nextInt();
        for(int i = 0; i<width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i<height-2; i++) {
            System.out.print("*");
            for (int j = 0; j<width-2;j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i<width; i++) {
            System.out.print("*");
        }
    }
}
