
import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //   int num =(int)(764.8367f);
        //   System.out.println(num);

        // automatic type promotion in expression 
        // int a= 257;
        // byte b= (byte)(a);
        // System.out.println(b);
        // byte  a = 40;
        //  byte b = 50;
        //   byte  c = 100;
        //    int d = (a*b )/ c;
        //     System.out.println(d);
        //   int Number = 'a';
        //   System.out.println(Number); 
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 97.65f;
        double d = 0.62462;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + (i / c) - (d - s));
        System.out.println(result);

    }
}
