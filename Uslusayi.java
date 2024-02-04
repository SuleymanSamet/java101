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


    }
}
