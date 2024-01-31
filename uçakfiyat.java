import java.util.Scanner;

public class uçakfiyat {
    public static void main(String[] args) {
        /*
        *Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
        *  bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
        * İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında
        * ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri
*  pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
* Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır
*
*
*  */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen gidilicek mesafeyi giriniz(km):");
        int km = scanner.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        int yas= scanner.nextInt();
        double normaltutar=km*0.10;
        double yasindirim = 0;
        if (yas<12){
            System.out.println("indirim tutarı %50");
            yasindirim=normaltutar*0.50;
            System.out.println("yaş indirimi : "+yasindirim);

        } else if (yas>=12&&yas<24) {
            System.out.println("%10 İNDİRİM");
            yasindirim=normaltutar*0.10;
            System.out.println("yaş indirimi : "+yasindirim);

        } else if (yas>65) {
            System.out.println("bilet fiyatı üzerinden %30 indirim");
            yasindirim=normaltutar*0.30;
            System.out.println("yaş indirimi : "+yasindirim);
        }
        double indirimlitutar=normaltutar-yasindirim;
        System.out.println("İndirimli tutar :"+indirimlitutar);
        System.out.println("yolculuk tipi : 1-tekyön\n 2-gidiş dönüş");
        int tip= scanner.nextInt();
        if (tip==1){
            System.out.println("tekyön bilet aldınız");
            System.out.println("ödenecek tutar :"+indirimlitutar);

        } else if (tip==2) {
            System.out.println("Gidiş dönüş bileti aldınız");
            System.out.println("Bilet fiyatı üzerinden %20 indirim");
            double gidisdonusindirim=indirimlitutar*0.20;
            System.out.println("gidiş dönüş bilet indirimi: " +gidisdonusindirim );
            double toplamtutar=(indirimlitutar-gidisdonusindirim)*2;
            System.out.println("Bilet fiyatı:"+toplamtutar);
        }else {
            System.out.println("Hatalı tuşlama yaptınız");
        }

    }
}
