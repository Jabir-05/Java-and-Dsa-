
import java.util.Scanner;

public class NestedSwtich {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();
        switch (empID) {
            case 1:
                System.out.println("Jabir Imteyaz");
                break;
            case 2:
                System.out.println("Shadaan Saiphy");
                break;
            case 3:
            System.out.println("Enter Emp number 3");
        

                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Managemnent department's");
                        break;
                    default:
                        System.out.println("No departments ");
                }
              
                break;
                default:
                System.out.println("Enter correct EmpID");
        }
       
    }
}
