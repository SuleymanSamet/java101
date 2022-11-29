
    import java.util.Scanner;

    public class taksimetre{
        public static void main(String[] args){
            int km;
            double ucret=2.20,total=10;

            Scanner input=new Scanner(System.in);
            System.out.print("alınan Yol ;");
            km = input.nextInt();

            total +=(km*ucret) ;
            total=(total<20)? 20 : total;
            System.out.println("Toplam Tutar : "+total);



        }
}
