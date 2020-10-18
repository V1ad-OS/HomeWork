import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
     int[] array1 = new int[15];
     int[] array2 = new int[30];
     int j = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.floor(Math.random()*10);
        }
        for (int i = 0; i < array2.length - 15; i++) {
            array2[i] = array1[i];
        }
        for (int i = 15; i < array2.length; i++) {
            array2[i] = array1[j] * 2;
            j++;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
