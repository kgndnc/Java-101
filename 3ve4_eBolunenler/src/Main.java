import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum=0, quantity=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int num = scan.nextInt();

        System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayılar");
        for (int i=1; i<= num; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                sum += i;
                quantity++;
            }
        }
        double average = (double) sum / quantity;
        System.out.println("Bu sayıların ortalaması = " + average);
    }
}
