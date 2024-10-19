package array;


public class SecondMaxElement {

    static void secondMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != max){
                second = Math.max(arr[i],second);
            }
        }
        System.out.println("Second maximum element is " + second);
    }
    
    static int firstRepeatElement(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i]; // present
                }
            }
        }
        return -1; // not present 

    }
    public static void main(String[] args) {
        
        int[] arr = {2,6,4,3,8,5,1};
        int[] arr1 = {3,1,2,3,4,5,2};

        // second max element
        // secondMaxElement(arr);
        int res = firstRepeatElement(arr1);
        System.out.println(res);
    }
}
