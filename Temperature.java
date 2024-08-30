
import java.util.Scanner;

class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter Temp in :");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9 / 5) + 32;
        System.out.println(tempF);

    }
}
