package java101;

import java.util.Scanner;

public class ArmstronSayi {
    public static void main(String[] args) {
        /*N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
         sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım.
(4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
 Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım.
(1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354
sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.*/
        System.out.print("Sayı Giriniz :");
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
        //BİR SAYININ BASAMAK SAYILARINI TOPLAMINI HESAPLAYAN PROGRAM Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        int adet=0;
        int toplam=0;
        while (number!=0){
            toplam=(number%10)+toplam;
            number/=10;
            ++adet;
        }
        System.out.println("Basamak toplamı : "+toplam);



    }
}
