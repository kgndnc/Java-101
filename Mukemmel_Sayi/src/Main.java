import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num = scan.nextInt();
        int total = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                total += i;
        }
        if (num == total && num != 0)
            System.out.println(num + " mükemmel sayıdır.");
        else
            System.out.println(num + " mükemmel sayı değildir.");
    }
}
