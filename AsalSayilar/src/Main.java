public class Main {

    public static void main(String[] args) {

        boolean isPrime= false;

        for (int j = 1 ; j <= 100; j++) {
            if (j == 2)
                isPrime = true;
            else {
                for (int i = 2; i < j; i++) {
                    if (j % i == 0) {
                        isPrime = false;
                        break;
                    }
                    else
                        isPrime =true;
                    }
                }
            if (isPrime)
                System.out.print(j + " ");
        }

    }
        
}
