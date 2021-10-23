import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        double result = 0;

        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        System.out.printf("Sonuc = %.3f%n",result);

    }
}
