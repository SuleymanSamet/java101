import java.util.Scanner;

public class kdvTutarı {
    public static void main(String[] args){
        //1: kitap ve kdv oranini tanımlama
        int kitap;
        double kdvOran =0.18;
        double kdvOran2= 0.8;

        Scanner input = new Scanner(System.in);
        //2: kitap degerini ekrana yazdırma komutu
        System.out.print("kitap tutarını giriniz:");
        kitap= input.nextInt();

        double kdvTutar= kitap*kdvOran;

        kdvTutar= kitap>0 && kitap<1000? kitap*kdvOran:kitap*kdvOran2;

        //kdvli tutarı hesaplama
        System.out.print("KDV li Tutar : ");
        int kvdliTutar = kitap+=kdvTutar;
        System.out.println(kvdliTutar);






    }
}
