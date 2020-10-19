import java.util.Scanner;

class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder(b);
        b = sb.reverse().toString();
        char[] bChar = b.toCharArray();
        int number = 0;
        for (int i = 0; i < bChar.length; i++) {
            if (bChar[i] == '1') {
                number = (int) (number + Math.pow(2, i));
            }
        }
        System.out.println(number);

    }
}
