import java.util.Scanner;
public class sıralama {
        public static void main(String[] args) {
            int a,b,c;
            Scanner inp = new Scanner(System.in);
            System.out.print("A.Sayı :");
            a = inp.nextInt();
            System.out.println("B.Sayı :");
            b= inp.nextInt();
            System.out.println("C.Sayı :");
            c=inp.nextInt();
            if ((a>b) && (a>c)){
                if (b>c){
                    System.out.println("A>B>C");
                }else{
                    System.out.println("A>C>B");
                }
            } else if ((b>a)&&(b>c)) {
                if (a>c){
                    System.out.println("B>A>C");
                }else{
                    System.out.println("B>C>A");
                }

                
            }else{
                if (a>b){
                    System.out.println("C>A>B");
                }else{
                    System.out.println("C>B>A");
                }
            }

        }
}
