

import java.util.Arrays;
import java.util.Scanner;

public class FunctionPart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Chnage value
         // Create An aary 
         int []arr = {1,3,4,5,6};
         Change(arr);
         System.out.println(Arrays.toString(arr));

    }
    static void  Change (int [] nums){
        nums[0]=99;

    }
}
