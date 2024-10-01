package sept.Task;

import java.lang.runtime.SwitchBootstraps;

public class Task_sep23 {
    public static void main(String[] args) {

//Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
//
//Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information.

        int num1 =20;
        int num2 =40;
        int choice = 3;



        switch(choice){
            case 1:
                int add= num1 + num2;
                System.out.println(" addition is : " + add);
                break;

            case 2:
                int sub =num1 - num2;
                System.out.println("subtraction is : " + sub);
                break;

            case 3:
                int mul =num1 * num2;
                System.out.println("multiplication is : " + mul);
                break;

            case 4:
                int div = num1 / num2;
                System.out.println("division is : " + div);
                break;

            case 5:
                int mod = num1 % num2;
                System.out.println("modulous is : " + mod);
                break;

            default:
                System.out.println("Please Check and Try again");
        }
    }
}
