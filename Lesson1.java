import java.util.Calendar;
import java.util.Date;

class Lesson1 {
    public static void main(String[] args) {

        Calendar cl1 = Calendar.getInstance();
        Calendar cl2 = Calendar.getInstance();
        cl2.set(Calendar.MONTH, Calendar.SEPTEMBER);
        Date date1 = cl1.getTime();
        Date date2 = cl2.getTime();
        System.out.println(date1.getTime()-date2.getTime());

    }
}
