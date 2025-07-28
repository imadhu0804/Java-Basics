import java.util.Arrays;
import java.util.Scanner;

public class RearrangeAlternately {
    public static void rearrangeAlternatvely(int[] arr,int n){
        int[] temp=arr.clone();
        int start=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            arr[i]=(i%2==0) ? temp[end--] : temp[start++];
        }
        System.out.println("The alternative array is : " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rearrangeAlternatvely(arr, n);
    }
}
