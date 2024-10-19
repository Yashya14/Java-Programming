//? find unique number in array wherre all the elements are being repeated twice with one element being unique. 
package array;

import java.util.Scanner;
public class UniqueNumber {
    static void uniqueNo(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1; // if print -1 then code is wrong.
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }

        System.out.println("unique element is " +ans);
    }

    // 2nd approach
    static int uniqueElement(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans = ans ^ arr[i];
        }
        return ans;
        // if ans is 0 then unique element is not present
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

        // uniqueNo(numbers);
        System.out.println(uniqueElement(numbers));
    }
}
