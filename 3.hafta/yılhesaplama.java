import java.util.Scanner;
public class yılhesaplama {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Yıl Giriniz:");
        int year= input.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.print("SONUÇ: "+year+ " bir artık yıldır.");
            }
            else{
                System.out.print("SONUÇ: "+year+ " bir artık yıl değildir.");
            }
        }
        else if(year%4==0){
            System.out.print("SONUÇ: "+year+ " bir artık yıldır.");
        }
        else{
            System.out.print("SONUÇ: "+year+ " bir artık yıl değildir.");
        }

    }
}