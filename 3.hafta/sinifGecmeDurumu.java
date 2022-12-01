import java.util.Scanner;
public class sinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,tr,kimya,muzik;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matamatik Notunuzu Girin :");
        mat= inp.nextInt();


        System.out.print("Fizik Notunuzu Girin :");
        fizik= inp.nextInt();

        System.out.print("Türkce Notunuzu Girin :");
        tr= inp.nextInt();

        System.out.print("Kimya Notunuzu Girin :");
        kimya= inp.nextInt();

        System.out.print("Müzik Notunuzu Girin :");
        muzik= inp.nextInt();


        double gecme=(mat+fizik+tr+kimya+muzik)/5;
        if (gecme<=55){
            System.out.print("Kaldınız notunuz:"+gecme);
        }else{
            System.out.print("Geçtiniz notunuz :"+gecme);
        }
    }
}
