import java.util.Scanner;

public class KadanesAlgorithm {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}
