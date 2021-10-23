import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Boyunuzu metre cinsinden giriniz: ");
		float boy = scan.nextFloat();
		
		System.out.println("Kilonuzu giriniz: ");
		float kilo = scan.nextFloat();
		
		float bmi = kilo / (boy * boy);
		bmi *= 100;
		bmi = ( (int) bmi ) / 100.0f;

		
		System.out.println("Vucut kitle indeksiniz: " + bmi);
		scan.close();

	}

}
