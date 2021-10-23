import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ucgen kac satirdan olussun: ");

        int row = scan.nextInt();

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (row - i) * 2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
