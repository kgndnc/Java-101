import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int temp = scan.nextInt() , sonuc = 0;
        int sayi = temp;

        while (temp != 0){
            sonuc += temp % 10;
            temp /= 10;
        }
        System.out.println(sayi + " sayısının basamaklarının toplamı = " + sonuc);
    }
}
