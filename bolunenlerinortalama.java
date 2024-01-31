import java.util.Scanner;

public class bolunenlerinortalama {
    public static void main(String[] args) {
        /*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
        int k;
        int adet=0;
        int toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz : ");
        k= scanner.nextInt();
        for (int i=1;i<=k;i++){
            if (i%3==0&&i%4==0){
                toplam+=i;
                adet++;
            }
        }
        if (toplam>0){
            double sonuc=(double) toplam/adet;
            System.out.println(" 3 ve 4’e tam bölünebilenlerin ortalamasını");
            System.out.println("Ortalama : "+sonuc);
        }else {
            System.out.println("İşlem bitti");
        }
    }
}
