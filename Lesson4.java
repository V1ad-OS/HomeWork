import java.util.Formatter;

class Lesson4 {
    public static void main(String[] args) {

        for (int i = 2; i < 12; i += 1) {
            Formatter form = new Formatter();
            String text;
            form.format("%." + i + "f", Math.PI);
            text = form.toString();
            System.out.println(text);
        }
    }
}
