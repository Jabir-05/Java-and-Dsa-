
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input  from till user does not press X or x ?
        int ans = 0;
        while (true) {
            // Take  the operator as input \
        System.out.println("Enter the Opertor");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '_' || op == '*' || op == '/' || op == '%') {
// input two numbers
System.out.println("Enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '_') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {

                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }else if (op == 'X' || op == 'x'){
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}
