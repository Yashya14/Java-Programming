package array;
import java.util.*;

public class Freq {
    static void freq(int[] arr){
        Scanner sc = new Scanner(System.in);
        // int[] freqs = makeFreqArray(freq);
        int[] freq = new int[10000];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]] = freq[arr[i]] + 1;
        }

        int q = sc.nextInt();
        while(q-- > 0){
            System.out.print("Enter the number to be searched : ");
            int x = sc.nextInt();

            if(freq[x] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }
        sc.close();
        
    }

    // static int makeFreqArray(int[] arr){
    //     int[] freq = new int[10000];
    //     for(int i=0; i<arr.length; i++){
    //         freq[arr[i]] = freq[arr[i]];
    //     }
    //     return freq;
    // }
    public static void main(String[] args) {
        int[] arr = {5,6,5,400,560,1000,400};
        freq(arr);
        // System.out.println("ans : " + ans);
        
    }
}
