import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*	Armut : 2,14 TL
			Elma : 3,67 TL
			Domates : 1,11 TL
			Muz: 0,95 TL
			Patl�can : 5,00 TL
		 */
		Scanner s = new Scanner(System.in);
		
		System.out.println("Armut ka� kilo? : ");
		float armut = s.nextFloat();
		
		System.out.println("Elma ka� kilo? : ");
		float elma = s.nextFloat();
		
		System.out.println("Domates ka� kilo? : ");
		float domates = s.nextFloat();
		
		System.out.println("Muz ka� kilo? : ");
		float muz = s.nextFloat();
		
		System.out.println("Patl�can ka� kilo? : ");
		float patlican = s.nextFloat();
		s.close();
		
		float tutar =(float) armut*2.14f + elma*3.67f + domates*1.11f + muz*0.95f + patlican*5.00f;

		System.out.println("Toplam tutar: " + tutar);
	}

}
