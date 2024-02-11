package java101;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName,password;
        int hak=3;
        int bakiye=1500;
        int secim;
        int paraIslemleri;
        while (hak>0){
            Scanner scanner=new Scanner(System.in);
            System.out.print("Kullanıcı adı :");
            userName=scanner.nextLine();
            System.out.print("Şifre giriniz :");
            password=scanner.nextLine();
            if (userName.equals("Patika")&&password.equals("java101")){
                System.out.println("Sisteme giriş yaptınız");
                System.out.println("Bankamıza hoşgeldiniz yapmak istediniz işlemi seçin.");
                System.out.println("1-Para yatırma \n"+"2-Para çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                System.out.println("Lütfen yapmak istediniz işlemi seçin:");
                secim=scanner.nextInt();

                switch (secim){
                    case 1:
                        System.out.println("Yatırmak istediğiniz tutar :" );
                        paraIslemleri=scanner.nextInt();
                        bakiye+=paraIslemleri;

                    case 2:
                        System.out.println("Çekmek istediğiniz tutar :");
                        paraIslemleri= scanner.nextInt();
                        if (paraIslemleri>bakiye){
                            System.out.println("Yetersiz bakiye");
                        }else{
                            bakiye-=paraIslemleri;
                        }

                    case 3:
                        System.out.println("Banka hesabınızdaki tutar : "+bakiye);

                    case 4:
                        System.out.println("Tekrar görüşmek üzere İyi günler.");
                        break;
                    default:
                        System.out.println("Hatalı tuşlama yaptınız.");
                }
                /*
                do {
                    System.out.println("1-Para yatırma \n"+"2-Para çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediniz işlemi seçin:");
                    secim=scanner.nextInt();
                    if (secim==1){
                        System.out.println("yatırılacak tutar : ");
                        paraIslemleri= scanner.nextInt();
                        bakiye+=paraIslemleri;
                    } else if (secim==2) {
                        System.out.println("Banka hesabınızdaki para:"+bakiye);
                        System.out.println("Ne kadar para çekmek istiyorsunuz : ");
                        paraIslemleri= scanner.nextInt();
                        if (paraIslemleri>bakiye){
                            System.out.println("Yetersiz Bakiye");
                        }else {
                            bakiye-=paraIslemleri;
                        }
                    } else if (secim==3) {
                        System.out.println("Banka hesabınızdaki para:" + bakiye);
                    }
                }while (secim!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;*/
            }else {
                hak--;
                if (hak==0){
                    System.out.println("Banka hesabınız bloke olmuştur bankanızla iletişime geçin");
                }else
                    System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz kalan hak:"+hak);
            }
        }


    }
}
