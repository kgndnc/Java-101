import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Üslü sayı hesaplama");
        System.out.print("Tabanı giriniz: ");
        int base = scan.nextInt();

        System.out.print("Üssü giriniz: ");
        int power = scan.nextInt();
        int result=1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println(base + "^" + power + " = " + result);

    }
}
