import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = scan.nextInt();

        System.out.print("Çin Zodyağı Burcunuz : ");

        if (dogumYili % 12 == 0)
            System.out.println("Maymun");
        else if (dogumYili % 12 == 1)
            System.out.println("Horoz");
        else if (dogumYili % 12 == 2)
            System.out.println("Köpek");
        else if (dogumYili % 12 == 3)
            System.out.println("Domuz");
        else if (dogumYili % 12 == 4)
            System.out.println("Fare");
        else if (dogumYili % 12 == 5)
            System.out.println("Öküz");
        else if (dogumYili % 12 == 6)
            System.out.println("Kaplan");
        else if (dogumYili % 12 == 7)
            System.out.println("Tavşan");
        else if (dogumYili % 12 == 8)
            System.out.println("Ejderha");
        else if (dogumYili % 12 == 9)
            System.out.println("Yılan");
        else if (dogumYili % 12 == 10)
            System.out.println("At");
        else
            System.out.println("Koyun");

    }
}
