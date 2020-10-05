import java.util.Scanner;

public class Cycles1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        for (int i = 0;i<10;i++) {
            for(int j = 1;j<column+1;j++) {
                if (j % 2 == 0) {
                    System.out.print("+++");
                } else {
                    System.out.print("***");
                }
            }
            System.out.println();
        }

    }
}
