
import java.util.Scanner;

public class FindMissingNumber {
    static int missingNumber(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]!=arr[i]+1){
                return arr[i]+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the sorted array elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sorted = missingNumber(arr);
        System.out.println("Missing number:"+ sorted);
        sc.close();
    }
}
