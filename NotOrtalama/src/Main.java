import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu girin: ");
		double matematik = scan.nextDouble();
		
		System.out.println("Fizik notunuzu girin: ");
		double fizik = scan.nextDouble();
		
		System.out.println("Kimya notunuzu girin: ");
		double kimya = scan.nextDouble();
		
		System.out.println("T�rk�e notunuzu girin: ");
		double turkce = scan.nextDouble();
		
		System.out.println("Tarih notunuzu girin: ");
		double tarih = scan.nextDouble();
		
		System.out.println("M�zik notunuzu girin: ");
		double muzik = scan.nextDouble();
		
		double ort = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
		String gecmeDurumu = (ort >= 60) ? "Ge�ti." : "Kald�.";
		
		System.out.printf("Ortalaman�z: %.2f\n%s",ort,gecmeDurumu);
		scan.close();
		
	}

}
