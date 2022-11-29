import java.util.Scanner;

public class notOrtalaması {
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp=new Scanner(System.in);

        System.out.print("Matamatik Notunuz :");

        mat=inp.nextInt();


        System.out.print("fizik notunuz : ");

        fizik=inp.nextInt();

        System.out.print("kimya Notunuz : ");
        kimya=inp.nextInt();


        System.out.print("türkce notunuz :");
        turkce=inp.nextInt();


        System.out.print("tarih notunuz :");
        tarih=inp.nextInt();


        System.out.print(" müzik notunuz : ");
        muzik=inp.nextInt();



        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc =toplam/6;
        System.out.print("Ortalamanız : "+ sonuc);

        boolean result= sonuc>=60;
        String str = result ? "Tebrikler,Sınıfı Geçtiniz." : "Üzgünüz, Sınıfta Kaldınız.";
        System.out.println(str);
    }
}

