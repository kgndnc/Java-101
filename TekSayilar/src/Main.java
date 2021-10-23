import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
	 * ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
	 */
        int sum=0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayi giriniz: ");
            int num = scan.nextInt();
            if (num % 2 == 1)
                break;
            if (num % 4 == 0){
                sum += num;
            }
        }
        System.out.println("Girdiğiniz sayılardan 4'ün katları olan sayıların toplamı = " + sum);
    }
}
