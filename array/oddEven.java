package array;

public class oddEven {
    static void oddEven(int[] arr){
        int n = arr.length;
        int left = 0,right = n-1;

        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if(arr[left] % 2 == 0){
                left++;
            }

            if(arr[right] % 2 == 1){
                right--;
            }
        }
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    static int[] sortSquare(int[] arr){
        int n = arr.length;
        int left = 0,right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        return ans;
    }

    
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {2,4,6,7,10};

        // oddEven(arr);
        int[] arr = sortSquare(arr1);
        printArray(arr);
    }
}
