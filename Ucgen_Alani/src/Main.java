import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/* �� kenar uzunlu�unu kullan�c�dan ald���n�z ��genin
		 * alan�n� hesaplayan program� yaz�n�z.
		 * ��genin �evresi a + b + c = 2u
		 * Alan = sqrt( u * (u-a) * (u-b) * (u-c) )
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��genin 1. kenarini giriniz: ");
		int a = scan.nextInt();
		
		System.out.println("��genin 2. kenarini giriniz: ");
		int b = scan.nextInt();
		
		System.out.println("��genin 3. kenarini giriniz: ");
		int c = scan.nextInt();
		
		double alan = UcgenAlan(a, b, c);
		System.out.println("��genin alani: " + alan);
		
	}
	
	private static double UcgenAlan(int a, int b, int c) {
		double u = (a + b + c) / 2.0;
		return Math.sqrt( u * (u-a) * (u-b) * (u-c) ); 
	}
	
}


