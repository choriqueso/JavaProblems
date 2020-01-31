public class MatthewsJavaProblems {
    public static void main(String[] args) {
        System.out.println(diff21(10));
        System.out.println(diff21(24));

        boolean result = nearHundred (5);
        boolean result2 = nearHundred(90);
        System.out.println(result);
        System.out.println(result2);

        boolean result3 = makes10 (5, 4);
        boolean result4 = makes10(5,5);
        System.out.println(result3);
        System.out.println(result4);

    }

//    TODO: Given an int n, return the absolute difference between n and 21.

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return n - 21;
        }
    }

//    TODO: Given an int n, return true if it is within 10 of 100 or 200.

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

//    TODO: Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }


}
