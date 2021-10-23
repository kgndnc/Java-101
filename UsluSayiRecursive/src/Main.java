import java.util.Scanner;

public class Main {

    static double usluSayiHesapla(double taban, double kuvvet){
        if(kuvvet == 1)
            return taban;
        else if (kuvvet == 0)
            return 1;
        else if (kuvvet > 1)
            return taban * usluSayiHesapla(taban,kuvvet-1);
        else
            return 1.0 / usluSayiHesapla(taban,-kuvvet);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degerini giriniz : ");
        double base = scan.nextDouble();
        System.out.print("Us degerini giriniz : ");
        double power = scan.nextDouble();

        System.out.println("Sonuc: " + usluSayiHesapla(base,power));
    }
}
