package array;

import java.util.Scanner;

public class PrefixSum {
    static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
   public static void main(String[] args) {
    int[] arr = {2,1,3,4,5};
    int[] ans = makePrefixSum(arr);
    // printArray(ans);
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    while(q-- > 0){
        System.out.println("Enter range : ");
        int left = sc.nextInt();
        int right = sc.nextInt();

        int answer = ans[right]-ans[left-1];
        System.out.println(answer);
    }
   } 
}
