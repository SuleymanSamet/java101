import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args){
        double total;
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;
        double kgarmut, kgelma, kgdomates, kgmuz, kgpatlican;
        Scanner input=new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız : ");
        kgarmut = input.nextDouble();

        System.out.print("Kaç Kilo Elma Aldınız : ");
        kgelma=input.nextDouble();

        System.out.print("Kaç Kilo Domates Aldınız : ");
        kgdomates=input.nextDouble();

        System.out.print("Kaç Kilo Muz Aldınız : ");
        kgmuz=input.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldınız : ");
        kgpatlican=input.nextDouble();

        total=((kgarmut*armut)+(kgelma*elma)+(kgdomates*domates)+(kgmuz*muz)+(kgpatlican*patlıcan));
        System.out.print("Toplam Tutar : "+total);

    }

}
