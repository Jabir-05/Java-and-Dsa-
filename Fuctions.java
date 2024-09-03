
import java.util.Scanner;




public class Fuctions {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
      //  int num1,num2,sum;
        // sum();
        // Greeting();
        // int ans = sum2();
        // System.out.println(ans);
        // int  ans = sum3(20, 40);
        // System.out.println(ans);

        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = input.next();
        String Personalised = MyGreet(name);
        System.out.println(Personalised);

    }
      //  Q : - Take input  of 2 numbers and print the sum :


    //   System.out.println("Enter number 1:");
    //    num1 = input.nextInt();
    //   System.out.println("Enter nimber 2 :");
    //    num2 = input.nextInt();
    //    sum = num1 + num2;
    //   System.out.println("The sum = " +sum);


    // method 
  //  static  void sum ()
  //    {
  //       Scanner input = new Scanner(System.in);
  // System.out.println("Enter number 1:");
  // int  num1 = input.nextInt(); 
  //   System.out.println("Enter nimber 2 :") ;
  //    int num2 = input.nextInt();
  //       int sum = num1 + num2 ;
  //         System.out.println("The sum = " +sum);
  //         input.close();

     //}

     // Greeting 
    //    static  void  Greeting()
    // {
    //   System.out.println("Hello Jabir");
    // }

  // return type value 
  //  static   int sum2 (){
  //   Scanner input = new Scanner(System.in);
  //   System.out.println("Enter number 1:");
  //   int  num1 = input.nextInt(); 
  //     System.out.println("Enter nimber 2 :") ;
  //      int num2 = input.nextInt();
  //         int sum = num1 + num2 ;
  //         input.close();
  //          return sum;
            
           

  //  }
    

   // Pass  the value number when you are calling method in main ()
// Arguments 
    // static int sum3 (int a, int b){
    //   int sum = a + b;
    //   return sum ;


    //}

      static String MyGreet (String name){
String  message = "Hello " + name ;
return message;
      }
    }


