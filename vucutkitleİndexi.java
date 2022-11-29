import java.sql.SQLOutput;
import java.util.Scanner;

public class vucutkitleİndexi {
    public static void main(String[] args){
        double b,kg,total;
        Scanner input=new Scanner(System.in);

        System.out.print("Boyunuzu yazın (Metre Cinsinden) : ");
        b = input.nextDouble();

        System.out.print("Kilonuzu yazın :");
        kg=input.nextDouble();

        total=kg/(b*b);
        System.out.print("Vücut Kitle İndexsiniz : "+total );
    }
}
