import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = scan.nextInt();

        System.out.print("1. sayiyi giriniz: ");
        int num = scan.nextInt();

        int min = num;
        int max = num;

        for (int i = 1; i < n; i++) {
            System.out.print((i+1) + ". sayiyi giriniz: ");
            num = scan.nextInt();
            if(num > max){
                max = num;
            }
            else if (num < min)
                min = num;
        }
        System.out.printf("%nEn buyuk sayi: %d%nEn kucuk sayi: %d",max,min);
    }
}
