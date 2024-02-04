package java101;

import java.util.Scanner;

public class Uslusayi {
    public static void main(String[] args) {
        //while ile üst alma işlemi
        Scanner scanner=new Scanner(System.in);
        System.out.println("Taban sayısı :");
        int taban= scanner.nextInt();
        System.out.println("Üst sayısı :");
        int ust=scanner.nextInt();
        int sonuc=1;
        int i=1;
        while (i<=ust){
            sonuc*=taban;
            i++;
        }
        System.out.println("cevap "+sonuc);
        
        //for ile üst alma
        System.out.println("Taban sayısını giriniz : ");
        int x= scanner.nextInt();
        System.out.println("Üst sayısını giriniz :");
        int y= scanner.nextInt();
        int sonuc=1;
        for (int i=1;i<=y;i++){
            sonuc*=x;
        }
        System.out.println("Sonuc : "+sonuc);


    }
}
