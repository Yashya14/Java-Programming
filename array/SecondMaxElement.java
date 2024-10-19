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
    public static void main(String[] args) {
        
        int[] arr = {2,6,4,3,8,5,1};

        // second max element
        secondMaxElement(arr);
    }
}
