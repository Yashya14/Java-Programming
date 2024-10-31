package array;

import java.util.Scanner;

public class RotateArray {

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // rotate array by 1
    // input - [1 ,2 ,3 ,4 ,5]  output - [2,3,4,5,1]
    static void rotateArray(int[] arr){
        int n = arr.length;
        int last = arr[n-1];
        for(int i=n-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = last;

    }

    // input - [1 ,2 ,3 ,4 ,5] output - [2,1,4,3,5]
    static void alternateArray(int[] arr){
        int size = arr.length;
        for(int i = 0;i<size;i+=2){
            if(i+1 < size){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    // Rotate array by kth steps

    static int[] rotateArrayByK(int[] arr,int k){
        int n = arr.length;
        k = k % n;

        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k;i<n;i++){
            ans[j++] = arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    // rotate an array by kth steps without using extra space

    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateInPlace(int[] arr,int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n +" elements");

        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        // call method
        // rotateArray(numbers);
        // printArray(numbers);

        // alternateArray(numbers);
        // int[] arr = rotateArrayByK(numbers,5);
        rotateInPlace(numbers,5);
        printArray(numbers);
    }
}
