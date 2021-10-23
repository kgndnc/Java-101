import java.util.Scanner;

public class Main {


    static Scanner scan = new Scanner(System.in);

    static boolean isPalindrom(int num){
        if(num == reverseNumber(num))
            return true;
        return false;
    }

    static int reverseNumber(int x){
        int temp = x;
        int digitNumber=0;

        while (temp!=0){
            temp/=10;
            digitNumber++;
        }
        System.out.print("digit number : " + digitNumber);

        temp=0;
        int mod;

        for (int i = 0; i < digitNumber; i++) {
            mod = x % 10;
            x /= 10;
            for (int j = i; j < digitNumber-1; j++) {
                mod *= 10;
            }
            temp += mod;
        }
        System.out.println("\nreversed number: " + temp);

        return temp;
    }

    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int a = scan.nextInt();
        scan.close();
        if (isPalindrom(a))
            System.out.println(a + " bir palindrom sayıdır.");
        else
            System.out.println(a + " bir palindrom sayı değildir.");
    }
}
