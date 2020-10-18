
public class Method4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 6, 7, 6, 44, 334, 23, 23, 22, 55, 77, 4};
        int element = 4;
        System.out.println(getIndex(array, element));
    }

    static int getIndex(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }
        return index;
    }
}
