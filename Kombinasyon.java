package java101;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Eleman sayısını giriniz :");
        int n= scanner.nextInt();
        System.out.println("Küme sayısını giriniz : ");
        int r= scanner.nextInt();

        int nFaktoriyel=1;
        int rFaktoriyel=1;
        int nMinusRFaktoriyel=1;

        for (int i=1;i<=n;i++){
            nFaktoriyel*=i;
        }
        for (int i=1;i<=r;i++){
            rFaktoriyel*=i;
        }
        for(int i = 1; i <= (n - r); i++)
        {
            nMinusRFaktoriyel *=i;
        }
        int c = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
        System.out.println("Kombinasyon: " + c);

    }
}
