import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double MESAFE_BASINA_UCRET = 0.10;

        Scanner scan = new Scanner(System.in);

        System.out.println("Mesafeyi KM türünden giriniz: ");
        int kilometre = scan.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int yas = scan.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scan.nextInt();

        if(kilometre>0 && yas >= 0 && (yolculukTipi==1 || yolculukTipi==2)) {

            double ilkTutar = kilometre * MESAFE_BASINA_UCRET;
            double yasIndirimOrani;
            if (yas<12){
                yasIndirimOrani = 0.5;
            }
            else if (yas <= 24)
                yasIndirimOrani = 0.1;
            else if (yas > 65)
                yasIndirimOrani = 0.3;
            else
                yasIndirimOrani = 0;
            double yasIndirimi = ilkTutar * yasIndirimOrani;
            double indirimliTutar = ilkTutar - yasIndirimi;
            double sonTutar = indirimliTutar;
            if (yolculukTipi == 2){
                sonTutar = (indirimliTutar * 0.8) * 2;
            }
            System.out.println("Toplam tutar = " + sonTutar);
        }
        else
            System.out.println("Hatalı veri girdiniz. ");
    }
}
