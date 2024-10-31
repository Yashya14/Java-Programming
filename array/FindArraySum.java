package array;

public class FindArraySum {
    static boolean equalSum(int[] arr){
        int totalSum = makeArraySum(arr);
        int prefSum = 0;

        for(int i = 0; i < arr.length;i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }
    static int makeArraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,3,1};
        boolean ans = equalSum(arr);
        System.out.println(ans);
    }
}
