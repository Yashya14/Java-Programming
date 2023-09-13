import java.util.*;

public class pattern {
    public static void main(String[] args) {
        // System.out.println("* * * *");
        // System.out.println("* * *");
        // System.out.println("* *");
        // System.out.println("*");
        
        Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine(); // take a whole string as input
        // String input = sc.next(); // single word
        // System.out.println("Enter the value : ");
        // int input = sc.nextInt(); // for integer value
        // System.out.println("The value is " + input);

        // float input = sc.nextFloat();
        // System.out.println(input);

        System.out.println("Enter the number : ");
        // int num = sc.nextInt();
        //square pattern
        for (int i = 1; i <= 4; i++) {
            System.out.println("* * * *");
        }
        sc.close();

    }
}
