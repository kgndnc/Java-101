import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mesafeyi KM cinsinden giriniz: ");
		int mesafe = scan.nextInt();
		
		System.out.println("Ödenmesi gereken tutar: " + ucretHesaplayici(mesafe) + " TL");
		scan.close();

	}
	
	private static float ucretHesaplayici(int kilometre) {
		float acilisUcreti = 10.0f;
		
		float tutar = acilisUcreti + (2.20f * kilometre);
		
		if (tutar < 20)
			return 20.0f;
		else
			return tutar;		
	}

}
