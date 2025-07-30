import java.util.Scanner;

public class MaxDifference {
    public static int maxDiff(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]);
        }
        return max-min;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxDiff(arr));
        sc.close();
    }
}
