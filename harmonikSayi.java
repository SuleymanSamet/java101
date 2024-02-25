package java101;

import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        int sayi=scanner.nextInt();
        double toplam=0.0;

        for (int i=1;i<=sayi;i++){
            toplam +=(1.0/i);
        }
        System.out.print(toplam);
    }



}
