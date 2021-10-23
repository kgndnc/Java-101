import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String correctPassword="sifre123";
        String userName, password;
        Scanner scan = new Scanner(System.in);
        boolean loop, tekrarGiris=false;

        do {
            System.out.print("Kullanici Adiniz: ");
            userName = scan.nextLine();

            System.out.print("Sifreniz: ");
            password = scan.nextLine();
            System.out.println();

            if(userName.equals("admin") && password.equals(correctPassword)){
                System.out.println("Giris Yaptiniz.");
                tekrarGiris=false;
            }
            else{
                System.out.println("Bilgileriniz yanlis.");

                do {
                    System.out.println("Sifrenizi sifirlamak ister misiniz? [E]vet [H]ayir");
                    String input = scan.next();

                    if (input.equalsIgnoreCase("e")){
                        // sifreyi sifirla
                        System.out.println("Yeni sifreyi giriniz: ");
                        scan.nextLine();
                        String newPassword = scan.nextLine();

                        if (newPassword.equals(password) || newPassword.equals(correctPassword)){
                            System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                            loop=true;
                        }
                        else {
                            correctPassword=newPassword;
                            System.out.print("Sifre olusturuldu.\nTekrar giris yapmak icin bir tusa basiniz.");
                            scan.nextLine();
                            loop=false;
                            tekrarGiris=true;
                        }

                    }
                    else if (input.equalsIgnoreCase("h")) {
                        // bir sey yapma
                        loop=false;
                    }
                    else{
                        System.out.println("Yanlis giris. Tekrar deneyiniz.");
                        loop=true;
                    }
                } while (loop);

            }
        } while (tekrarGiris);

    }
}
