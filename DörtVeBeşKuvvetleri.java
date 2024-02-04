package java101;

import java.util.Scanner;

public class DörtVeBeşKuvvetleri {
    /*Java döngüler ile girilen sayıya kadar olan
    4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Kaça kadar 4 ve 5 kuvvetlerini bulmak istiyorsunuz : ");
        n= scanner.nextInt();
        for (int i=0;i<n;i++){
            if (i%4==0&&i%5==0){
                System.out.println(i);
            }

        }

    }
}
