import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1,n2,selection;
        boolean loop=false;

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayiyi girin: ");
        n1 = scan.nextInt();
        System.out.print("\nİkinci sayiyi girin: ");
        n2 = scan.nextInt();

        System.out.println("\n1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme");

        do {
            System.out.print("Seciminizi yapin: ");
            selection = scan.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Toplam = " + (n1 + n2));
                    loop=false;
                    break;
                case 2:
                    System.out.println("Fark = " + (n1 - n2));
                    loop=false;
                    break;
                case 3:
                    System.out.println("Carpim = " + (n1 * n2));
                    loop=false;
                    break;
                case 4:
                    switch (n2){
                        case 0:
                            System.out.println("Bir sayi 0'a bolunemez. Tekrar deneyiniz.");
                            loop=false;
                            break;
                        default:
                            System.out.println("Bolum = " + (n1/n2));
                            loop=false;
                            break;
                    }
                        break;
                default:
                    System.out.println("Yanlis secim.");
                    loop=true;
            }
        } while (loop);

    }
}
