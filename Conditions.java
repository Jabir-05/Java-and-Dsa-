
import java.util.Scanner;

class Conditions {

    public static void main(String[] args) {

        // Q:- print number from 1 to 5 ?
        //  for (int num =0; num <=5; num++){
        //     System.out.println(num);
        //  }
        // Q :- print number from 1 to n 
        //    Scanner input = new Scanner (System.in);
        //    int n = input.nextInt();
        //    for(int num = 0; num <=n; num++){
        //     System.out.println(num + " ");
        //    }
        // while loop 
        //  int num = 1;
        //  while (num <=5){
        //     System.out.println(num);
        //     num++;
        //  } 
        // do while loop 
        // int n =1;
        // do{
        //     System.out.println(n);
        //     n++;
        // }
        //   while (n<=5);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q:- Find the largest of the 3 numbers ?
        int max = a;
        if (b > max) {
            max = b;

        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
