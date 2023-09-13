import java.util.*;

public class calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter your choice...");
        System.out.println("(1) for Addition");
        System.out.println("(2) for Subtraction");
        System.out.println("(3) for Multiplication");
        System.out.println("(4) for Division");
        System.out.println("(5) for Modulo");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The additio is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The subtraction is " + (num1 - num2));
                break;
            case 3:
                System.out.println("The multiplication is " + (num1 * num2));
                break;
            case 4:
                System.out.println("The division is " + (float)(num1 / num2));
                break;
            case 5:
                System.out.println("The modulo is " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid choice...!");
                break;
        }
        sc.close();
    }
}
