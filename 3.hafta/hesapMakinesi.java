import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,secim;
        Scanner input=new Scanner(System.in);
        System.out.print("iLK SAYIYI GİRİN ;");
        n1=input.nextInt();
        System.out.print("İKİNCİ SAYIYI GİRİNİZ ;");
        n2=input.nextInt();

        System.out.println("Toplama yapmak için 1 \nÇıkarma yapmak için 2\nçarpma yapmak için 3\nbölme yapmak için 4");
        secim=input.nextInt();
        System.out.println(secim);
        switch (secim){
            case 1: System.out.println("Toplam Sonuç : "+(n1+n2));
            break;
            case 2: System.out.println("Çıkarma Sonuç : "+(n1-n2));
            break;
            case 3: System.out.println("Çarpma Sonuç : "+(n1*n2));
            break;
            case 4: System.out.println("Bölme Sonuç : "+(n1/n2));
            break;
        }
    }
}
