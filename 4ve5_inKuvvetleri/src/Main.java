import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scan.nextInt();
        int i=1;
        int j=1;

        while (i < num ){
            System.out.println(i);
            i *= 4;
            if( j < num){
                System.out.println(j);
                j *= 5;
            }
        }
    }
}
