import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/* Üç kenar uzunluðunu kullanýcýdan aldýðýnýz üçgenin
		 * alanýný hesaplayan programý yazýnýz.
		 * Üçgenin çevresi a + b + c = 2u
		 * Alan = sqrt( u * (u-a) * (u-b) * (u-c) )
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Üçgenin 1. kenarini giriniz: ");
		int a = scan.nextInt();
		
		System.out.println("Üçgenin 2. kenarini giriniz: ");
		int b = scan.nextInt();
		
		System.out.println("Üçgenin 3. kenarini giriniz: ");
		int c = scan.nextInt();
		
		double alan = UcgenAlan(a, b, c);
		System.out.println("Üçgenin alani: " + alan);
		
	}
	
	private static double UcgenAlan(int a, int b, int c) {
		double u = (a + b + c) / 2.0;
		return Math.sqrt( u * (u-a) * (u-b) * (u-c) ); 
	}
	
}


