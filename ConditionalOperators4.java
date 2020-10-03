import java.util.Scanner;

public class ConditionalOperators4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a");
        Double a = sc.nextDouble();
        System.out.println("Введите сторону b");
        Double b = sc.nextDouble();
        System.out.println("Введите сторону c");
        Double c = sc.nextDouble();
        if(a+b>c && a+c>b && b+c>a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольника не существует");
        }

    }
}
