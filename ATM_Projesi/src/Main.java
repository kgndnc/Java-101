import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName="", password="";
        Scanner scan = new Scanner(System.in);

        int right = 3;
        int balance = 700;
        int select=-1;

        while (right > 0 && select != 4) {
            System.out.print("Kullanıcı adınız: ");
            userName = scan.nextLine();

            System.out.print("Şifreniz: ");
            password = scan.nextLine();
            switch (userName) {
                case "kgn":
                    switch (password){
                        case "sifre123":
                            System.out.println("Giriş Başarılı.");
                            do {
                                System.out.println("1-Para yatırma\n" +
                                        "2-Para Çekme\n" +
                                        "3-Bakiye Sorgula\n" +
                                        "4-Çıkış Yap");
                                System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz : ");
                                select = scan.nextInt();

                                switch (select){
                                    case 1:
                                        System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                                        int deposit = scan.nextInt();
                                        if (deposit > 0){
                                            balance += deposit;
                                        }
                                        else{
                                            System.out.println("Yatırılan miktar 0'dan büyük olmalıdır.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                                        int withdrawal = scan.nextInt();
                                        if (withdrawal > 0){
                                            balance -= withdrawal;
                                        }
                                        else{
                                            System.out.println("Çekilmek istenen miktar 0'dan büyük olmalıdır.");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("\nBakiyeniz: " + balance);
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("\nYanlış giriş. Tekrar deneyiniz.");
                                }

                            } while (select != 4);
                            break;

                        default:
                            System.out.println("Giriş başarısız.\nKalan hak: " + --right);
                            break;
                    }
                    break;
                default:
                    System.out.println("Giriş başarısız.\nKalan hak: " + --right);
                    break;
            }
        }

        switch (right) {
            case 0:
                System.out.println("3 kere yanlış giriş yapıldı. Hesabınız bloke edilmiştir." +
                        "\nBankamızla iletişime geçiniz.");
                break;
            default:
        }

    }
}
