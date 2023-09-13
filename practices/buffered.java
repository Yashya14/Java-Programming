import java.io.*;
import java.io.BufferedReader;

public class buffered {
    public static void main(String[] args) {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter any two numbers ");
        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            System.out.println("The value of a before swap is " + a);
            System.out.println("The value of b before swap is " + b);

            c = a;
            a = b;
            b = c;

            System.out.println("The value of a after swap is " + a);
            System.out.println("The value of b after swap is " + b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

