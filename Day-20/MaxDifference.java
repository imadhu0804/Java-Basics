import java.util.Scanner;

public class MaxDifference {
    public static int maxDifference(int[] arr){
        int min=arr[0];
        int maxDiff=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            maxDiff=Math.max(maxDiff,arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum difference is: " + maxDifference(arr));
        sc.close();
    }
}
