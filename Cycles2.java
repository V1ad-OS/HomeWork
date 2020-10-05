import java.util.Scanner;

public class Cycles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int readFact = sc.nextInt();
        int fact =1;
        if(readFact < 16 && readFact >4) {
            for (int i = 1; i <= readFact; i++) {
                fact *= i;
            }
            System.out.println(fact);
        } else {
            System.out.println("������������ �����");
        }
    }
}
