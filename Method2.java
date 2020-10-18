public class Method2 {
    public static void main(String[] args) {
 System.out.println(getStr(50,20.5,"Sum = "));
    }

    static String getStr(int a, Double b, String str) {
        Double sum = a + b;
        return str + sum;
    }
}
