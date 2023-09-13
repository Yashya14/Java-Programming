public class reverse {
    public static void main(String args[]) {
        // reverse of a number
        // int n = 10899;
        // while (n>0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n = n/10;
        // }
        // System.out.println();

        // reverse the given number
        int n = 987601;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
