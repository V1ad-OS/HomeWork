class Lesson2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 3, 12, 3, 0,11,22};
        System.out.println(getString(arr));
    }

    public static String getString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i] + ", ");
        }
        sb.append(arr[arr.length - 1] + "]");
        return sb.toString();
    }

}
