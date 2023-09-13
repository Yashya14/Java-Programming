import java.util.Scanner;

public class basic{
    public static void main(String args[]) {
        System.out.println("Hello world");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a);
        if(a ==36) {
            System.out.println(a>>3);
            System.out.println(a<<2);
        }else if (a==56){
            System.out.println(a>>1);
            System.out.println(a<<3);
        }else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}