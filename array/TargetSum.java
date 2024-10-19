package array;

import java.util.Scanner;
public class TargetSum {
    // two pair sum problem
    static void targetArraySum(int[] arr,int target){
        int n = arr.length;
        int count = 0;
    
        for(int i = 0; i < n; i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                    count++;
                }
                
            }
        }
        System.out.println("Number of pairs : " + count);
    }

    static void tripletSum(int[] arr,int target){
        int n = arr.length;
        int count = 0;
    
        for(int i = 0; i < n; i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                        count++;
                    }
                }
                
                
            }
        }
        System.out.println("Number of pairs : " + count);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " elements");
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        // call method
        // targetArraySum(arr,8);
        tripletSum(arr,8);
    }
}
