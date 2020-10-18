public class Method5 {
    public static void main(String[] args) {
        System.out.println(getWordCount("word word word word word word"));
    }
   static int getWordCount(String str) {
        String[] words = str.split(" ");
        return words.length;
   }
}
