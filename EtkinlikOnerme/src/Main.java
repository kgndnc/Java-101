import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int temperature;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sicaklik giriniz: ");
        temperature = scan.nextInt();

        if(temperature < 5 ){
            System.out.println("Kayak yapabilirsin.");
        }
        else if (temperature <= 10)
            System.out.println("Sinemaya gidebilirsin.");
        else if (temperature <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
            System.out.println("Piknik yapabilirsin.");
        }
        else if (temperature <= 25)
            System.out.println("Piknik yapabilirsin.");
        else
            System.out.println("Yuzmeye gidebilirsin.");

    }
}
