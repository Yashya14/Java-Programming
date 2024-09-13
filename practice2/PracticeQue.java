package practice2;

public class PracticeQue {
    public static void palindrome(int n){
        int ans = 0,digit;
        int m = n;
        while( m != 0 ){
            digit = m % 10;
            ans = ans * 10 + digit;
            m = m / 10;
        }
        if(ans == n){
            System.out.println(n +" is Palindrome number");
        }else{
            System.out.println(n +" is is not Palindrome number");
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to practice");
        
        palindrome(123);

    }   
}
