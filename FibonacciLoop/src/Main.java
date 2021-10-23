import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 0 1 1 2 3 5 8 13 21 34 55 89

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç adım sürsün? : ");
        int adim = scan.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;
        System.out.print(sayi1 + " " + sayi2);
        for (int i = 2; i < adim; i++) {
            int sayi3 = sayi1 + sayi2;

            System.out.print(" " + sayi3);
            sayi1 = sayi2;
            sayi2 = sayi3;
        }
    }
}
