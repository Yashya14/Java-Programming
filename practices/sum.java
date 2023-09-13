import java.util.*;

public class sum {
    public static void main(String args[]){
        // Addition and product of two numbers
        // int a = 40,b = 20,c;
        // c = a+b;
        // System.out.println("The sum of a and b is "+c);

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = a+b;
        // int d = a*b;
        // System.out.println("The sum of a and b is "+c);
        // System.out.println("The product of a and b is "+d);

        // Area of circle
        // float radius = sc.nextFloat();
        // float area = 3.14F * radius * radius;
        // System.out.println("The area of circle is "+area);

        // Type casting in java
        // float a = 34.50F;
        // int b = (int)a;
        // System.out.println("b = "+b);

        // Type promotion in expressions
        // char a = 'a'; // 97
        // char b = 'b'; // 98
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println(b-a);

        byte b = 5;
        b = (byte)(b*2); // b = b*2 -->wrong
        System.out.println("b = "+b);

        sc.close();
    }
}
