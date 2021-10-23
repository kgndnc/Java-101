public class Main {
    // 0 1 1 2 3 5 8 13 21 34 55 89
    // 0 1 2 3 4 5 6  7  8  9 10 11
    static int fib(int n) {
        if(n < 0)
            return -1;
        else if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(11));
    }
}
