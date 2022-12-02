import java.util.Scanner;
    public class cinzodyağı {
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);

            System.out.print("Doğum yılınızı giriniz:");
            int yıl= input.nextInt();

            int kalan=yıl%12;

            switch (kalan){
                case 0:
                    System.out.print("Çin Zodyağı Burcunuz:"+" MAYMUN");
                    break;
                case 1:
                    System.out.print("Çin Zodyağı Burcunuz:"+" HOROZ");
                    break;
                case 2:
                    System.out.print("Çin Zodyağı Burcunuz:"+" KÖPEK");
                    break;
                case 3:
                    System.out.print("Çin Zodyağı Burcunuz:"+" DOMUZ");
                    break;
                case 4:
                    System.out.print("Çin Zodyağı Burcunuz:"+" FARE");
                    break;
                case 5:
                    System.out.print("Çin Zodyağı Burcunuz:"+" ÖKÜZ");
                    break;
                case 6:
                    System.out.print("Çin Zodyağı Burcunuz:"+" KAPLAN");
                    break;
                case 7:
                    System.out.print("Çin Zodyağı Burcunuz:"+" TAVŞAN");
                    break;
                case 8:
                    System.out.print("Çin Zodyağı Burcunuz:"+" EJDERHA");
                    break;
                case 9:
                    System.out.print("Çin Zodyağı Burcunuz:"+" YILAN");
                    break;
                case 10:
                    System.out.print("Çin Zodyağı Burcunuz:"+" AT");
                    break;
                case 11:
                    System.out.print("Çin Zodyağı Burcunuz:"+" KOYUN");
                    break;
                default:
                    System.out.print("HATALI GİRİŞ YAPTINIZ!");

            }

        }
    }

