import java.lang.*;

public class ExceptionA {
    public static void main(String args[]){
        // try{
        //     int result = 10/0;
        // }catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        int age = 10;
        
        if(age<18){
            throw new ArithmeticException("Invalid age");
        }else{
            System.out.println("age is greater than 18");
        }
    }
}
