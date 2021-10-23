import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ürünün fiyatýný giriniz:");
		float fiyat = scan.nextFloat();
		
		System.out.printf("KDV'siz fiyat = %.2f\n", fiyat);
		System.out.printf("KDV'li fiyat = %.2f\n", (fiyat + KDVHesaplayici(fiyat)));
		System.out.printf("KDV tutarý = %.2f", KDVHesaplayici(fiyat) );		
	
		scan.close();
	}
	
	private static float KDVHesaplayici (float vergiHaricFiyat) {
		if(vergiHaricFiyat < 0 )
			return -1;
		else if (vergiHaricFiyat < 1000 )
			return vergiHaricFiyat * 0.18f;
		else
			return vergiHaricFiyat * 0.08f;
	}

}
