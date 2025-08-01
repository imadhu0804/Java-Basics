import java.util.Arrays;
import java.util.Scanner;

public class DutchFlag {
    public static void dutchFlag(int[] arr){
        int low=0,mid=-0,high=arr.length-1;

        while(mid<=high){
            switch (arr[mid]) {
                case 0:
                    int temp1=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp1;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp2;
                    high--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        dutchFlag(arr);
        System.out.println(Arrays.toString(arr));
    }
}
