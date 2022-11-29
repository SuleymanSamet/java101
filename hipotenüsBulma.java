import java.util.Scanner;

public class hipotenüsBulma {
        public static void main(String[] args){
            int a,b;
            double c;
            Scanner girdi=new Scanner(System.in);
            System.out.println("1. Kenarı giriniz : ");
            a= girdi.nextInt();
            System.out.println("2. Kenarı giriniz : ");
            b=girdi.nextInt();

            c=Math.sqrt((a*a)+(b*b));
            System.out.println("Hipotesün : "+ c);


        }
}
