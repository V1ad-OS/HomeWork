public class Method1 {
    public static void main(String[] args) {
        System.out.println(getMax(-2,-5,-9));
    }

    static int getMax(int... arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
