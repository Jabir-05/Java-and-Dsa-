
public class CountNum {
    
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int n = 45563;
        int count = 0;

         while (n >= 0){
            int rem = n % 10;
            if (rem == 5){
                count++;

            }
            n = n / 10;
         }
         System.out.println(count);

    }
}
