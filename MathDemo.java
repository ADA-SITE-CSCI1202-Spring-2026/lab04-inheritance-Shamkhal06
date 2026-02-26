package week06;

public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }
        public static void main(String[] args) {

        System.out.println(min(3, 7));
        System.out.println(max(3, 7));

        int[] numbers = {1, 2, 3, 4};
        System.out.println(sum(numbers));
    }

}