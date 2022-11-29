import java.util.Scanner;
    public class daireAlanCevreHesaplama{
        public static void main(String[] args){
        int r;
        double pi=3.14;
            Scanner input=new Scanner(System.in);
            System.out.print("Yarı Çapı giriniz :");
            r = input.nextInt();
            double alan = pi * r * r ;
            System.out.println("Alanı : " + alan);
            double cevre = 2 * pi * r ;
            System.out.println("Çevresi : "+ cevre);
        }
    }