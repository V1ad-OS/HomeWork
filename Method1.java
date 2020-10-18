public class Method1 {
    public static void main(String[] args) {
        System.out.println(getMax(3, 2, 3, 4, 2, 1));
    }

    static int getMax(int... arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
