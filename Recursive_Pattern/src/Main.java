import java.util.Scanner;

public class Main {

    static int initialValue;

    static void pattern(int n){
        if (n>0)
            positivePortion(n);
        else
            negativePortion(n);
    }
    static void positivePortion(int n){
        if(n>0) {
            System.out.print(n + " ");
            pattern(n-5);
        }
        else{
              pattern(n);
        }
    }

    static void negativePortion(int n){
        if(n == initialValue)
            System.out.print(n);
        else {
            System.out.print(n + " ");
            negativePortion(n+5);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("N sayisi: ");

            initialValue = scan.nextInt();
            if (initialValue <= 0)
                System.out.println("N sayisi pozitif olmalidir.");
        } while (initialValue <= 0);

        System.out.print("Ciktisi: ");
        pattern(initialValue);
    }
}
