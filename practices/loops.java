import java.util.*;

public class loops {
    public static void main(String args[]) {
        // while loop
        // int n = 1;
        // while(n<=10){
        //     System.out.print(n + " ");
        //     n++;
        // }
        
        // for loop -->(initialisation; condition; increment/decrement)
        // for (int i = 2; i <= 10; i+=2) {
        //     System.out.println(i + " ");
        // }.

        // do while loop --> it will always executes ones before checking condition -- exit control loop
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{
            System.out.println(n);
            n++;
        }while(n<=10);
        sc.close();
    }
}
