import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fiz, tur, kim, muz;
        int temp;
        int dersSayisi=0, toplamNot=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        temp = scan.nextInt();
        if(temp >= 0 && temp <= 100){
            mat = temp;
            dersSayisi++;
            toplamNot+=mat;
        }

        System.out.print("Fizik notunuzu giriniz:");
        temp = scan.nextInt();
        if(temp >= 0 && temp <= 100){
            fiz = temp;
            dersSayisi++;
            toplamNot+=fiz;
        }

        System.out.print("Turkce notunuzu giriniz:");
        temp = scan.nextInt();
        if(temp >= 0 && temp <= 100){
            tur = temp;
            dersSayisi++;
            toplamNot+=tur;
        }

        System.out.print("Kimya notunuzu giriniz:");
        temp = scan.nextInt();
        if(temp >= 0 && temp <= 100){
            kim = temp;
            dersSayisi++;
            toplamNot+=kim;
        }

        System.out.print("Müzik notunuzu giriniz:");
        temp = scan.nextInt();
        if(temp >= 0 && temp <= 100){
            muz = temp;
            dersSayisi++;
            toplamNot+=muz;
        }

        double ortalama = (double) toplamNot / dersSayisi;

        if (ortalama >= 55) {
            System.out.println("Tebrikler! Sinifi gectiniz.");
        }
        else {
            System.out.println("Sinifta kaldiniz :<");
        }
        System.out.println(String.format("Ortalamaniz: %.2f" , ortalama ));

    }
}
