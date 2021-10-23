import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dairenin yarıçapını giriniz: ");
		double radius = scan.nextDouble();
		
		System.out.println("Daire diliminin merkez açısını giriniz: ");
		double degree = scan.nextDouble();
		
		System.out.println("Daire diliminin alanı: " + Alan(radius,degree));
		scan.close();
	}
	
	private static double Alan(double r , double alfa) {
		return (Math.PI * r * r) * (alfa/360);
	}

}
