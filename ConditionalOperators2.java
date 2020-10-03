import java.util.Scanner;

public class ConditionalOperators2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер квартиры:");
        int apartmen = sc.nextInt();
        int entr = 0;
        int storey = 0;
        double apartment = apartmen;
        if(apartment > 144 || apartment < 1) {
            System.out.println("Такой квартиры нет");
        } else {
            if(apartment > 0 && apartment < 37) {
                    entr = 1;
                    storey =(int) (Math.ceil(apartment/4));
            } else if(apartment > 36 && apartment < 73) {
                    entr = 2;
                    storey = (int) (Math.ceil(apartment/4)) - 9;
            } else if(apartment > 72 && apartment < 109) {
                    entr = 3;
                    storey = (int) (Math.ceil(apartment/4)) - 18;
            } else if(apartment > 108 && apartment < 145) {
                    entr = 4;
                    storey = (int) (Math.ceil(apartment/4)) - 27;
            }
            System.out.println("этаж: " + storey + ". подъезд: " + entr);
        }

    }
}
