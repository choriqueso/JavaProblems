public class MatthewsJavaProblems {
    public static void main(String[] args) {
        System.out.println(diff21(10));
        System.out.println(diff21(24));
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return n - 21;
        }
    }

}
