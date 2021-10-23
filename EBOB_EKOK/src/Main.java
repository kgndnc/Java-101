import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        int smallNumber = scan.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        int largeNumber = scan.nextInt();

        if (smallNumber < 0)
            smallNumber = -smallNumber;
        if (largeNumber < 0)
            largeNumber = -largeNumber;

        if (smallNumber > largeNumber){
            int temp = smallNumber;
            smallNumber = largeNumber;
            largeNumber = temp;
        }

        int ebob = 1;
        int i = smallNumber;
        while (i >= 1){
            if(smallNumber % i == 0 && largeNumber % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        int ekok = largeNumber;
        i = largeNumber;
        while (i <= smallNumber * largeNumber) {
            if(i % smallNumber == 0 && i % largeNumber == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.printf("EBOB(%d,%d) = %d%nEKOK(%d,%d) = %d%n",smallNumber,largeNumber,ebob,smallNumber,largeNumber,ekok);
    }
}
