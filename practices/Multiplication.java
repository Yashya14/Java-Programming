import java.util.*;

public class Multiplication {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Multiplication table of "+num);
        for(int i = 1; i <= 10; ++i){
            System.out.println(num +"*" +i +" = " +num*i);
        }
    }
}
