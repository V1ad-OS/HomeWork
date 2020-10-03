import java.util.Scanner;

public class ConditionalOperators1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        Double a = sc.nextDouble();
        System.out.println("Введите второе число:");
        Double b = sc.nextDouble();
        System.out.println("Введите третье число:");
        Double c = sc.nextDouble();
        System.out.println("Введите четвертое число:");
        Double d = sc.nextDouble();
        Double max;
        max = a;
        if (b>max) {
            max = b;
        }
        if(c>max) {
            max = c;
        }
        if(d>max) {
            max = d;
        }
        System.out.println(max);

    }
}
