import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner scan = new Scanner(System.in);

        System.out.println("Kombinasyon hesaplama\nC(n,r) olmak üzere;");
        System.out.print("n'yi giriniz: ");
        int n = scan.nextInt();
        int ilkSayi = n;

        System.out.print("r'yi giriniz: ");
        int r = scan.nextInt();
        int ikinciSayi = r;

        int n_r = n-r;

        int nFact = 1;

        while (n > 0){
            nFact *= n;
            n--;
        }

        int rFact = 1;

        while (r > 0){
            rFact *= r;
            r--;
        }
        int n_rFact = 1;


        while (n_r > 0){
            n_rFact *= n_r;
            n_r--;
        }
        //C(n,r) = n! / (r! * (n-r)!)
        int kombinasyon =  nFact / (rFact * n_rFact);
        System.out.printf("C(%d,%d) = %d",ilkSayi,ikinciSayi,kombinasyon);
    }
}
