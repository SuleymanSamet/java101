import java.util.Scanner;
public class kullanıcıGirisi {
    public static void main(String[] args) {
        String kullanici,sifre;

        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz : ");
        kullanici= inp.nextLine();

        System.out.print("Şifre giriniz : ");
        sifre=inp.nextLine();

        if (kullanici.equals("patika") && sifre.equals("java123")){
            System.out.print("Giriş Başarılı ");
        }else{
            System.out.println("Giriş Başarısıza");
        }

    }
}
