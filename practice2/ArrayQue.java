package practice2;
import java.util.*;

public class ArrayQue {
    public static void inputArray(){
        int marks[] = new int[5];
        System.out.println("Enter array of marks : ");
        java.util.Scanner sc = new Scanner(System.in);
        for(int i=0; i<marks.length; i++){
           marks[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        for(int i=0; i<marks.length; i++){
            ans = ans + marks[i];
            // System.out.print(marks[i] + " ");
            System.out.println("sum is " + ans);
        }
        System.out.println();
    }

    public static void updateArray(int marks[]){
        for(int i=0; i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
    
    public static int linearSearch(int marks[],int key){
        for(int i = 0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static int getLargest(int numbers[]){
        int large = Integer.MIN_VALUE; // - infinity
        int small = Integer.MAX_VALUE;
        for (int i = 0;i<numbers.length;i++){
            if(large < numbers[i]){
                large = numbers[i];
            }
            if(small > numbers[i]){
                small = numbers[i];
            }
        }
        System.out.println("smallest value is " + small);
        return large;
    }
    
    public static int binarySearch(int numbers[], int key){
        int start = 0,end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end ) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // inputArray();
        int marks[] = {1, 2, 3, 4, 5};
        // updateArray(marks);
        // linearSearch
        // int ans = linearSearch(marks, 6);
        // System.out.println("At index : "+ ans);

        // largerst no in array
        int numbers[] = {34,2,3,14,90};
        int key = 1;
        // System.out.println("Largest number : "+ getLargest(numbers));
        System.out.println("index is : " + binarySearch(numbers, key));
        
    }
}