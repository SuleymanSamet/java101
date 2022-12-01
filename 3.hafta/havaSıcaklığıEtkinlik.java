import java.util.Scanner;

public class havaSıcaklığıEtkinlik {
    public static void main(String[] args) {
        int sicak;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        sicak=inp.nextInt();
        if (sicak<5){
            System.out.println("Kayak Yapabilirsiniz sıcaklık "+sicak);
        }
        if (sicak>5 && sicak<15){
            System.out.println("Sinamaya Gidebilirsiniz sıcaklık "+sicak);
        }
        if (sicak>10 && sicak<25){
            System.out.println("Piknik Yapmaya Gidebilirsiniz Sıcaklık "+sicak);

        }else{
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
