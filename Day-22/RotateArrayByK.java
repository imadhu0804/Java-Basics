import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[] arr,int left,int right) {
        while(left<right){
            int temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        rotate(arr,k);
        System.out.println("Rotated array: "+ Arrays.toString(arr));
        sc.close();
    }
}
