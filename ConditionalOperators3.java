import java.util.Scanner;

public class ConditionalOperators3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = sc.nextInt();
        int a = 365;
        if (year%4 == 0) {
            a = 366;
            if(year%100 == 0) {
                a = 365;
                if(year%400 == 0) {
                    a = 366;
                }
            }
        }
        System.out.println(a + " days");
    }
}
