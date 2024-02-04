package java101;

import java.util.Scanner;

public class çiftsayıvekatları {
    public static void main(String[] args) {
        /*
        * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        * girilen değerlerden çift ve
        *  4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
        Scanner scanner= new Scanner(System.in);
        int n;
        int toplam=0;
        do {
            System.out.println("Sayı girin: ");
            n= scanner.nextInt();
            if (n%4==0){
                toplam+=n;
            }
        }while (n%2==0);
        System.out.println("Toplam :"+toplam);
    }
}
