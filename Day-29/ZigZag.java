import java.util.Arrays;
import java.util.Scanner;

public class ZigZag {
    public static void zigZag(int[] arr){
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(flag){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }else{
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag =!flag;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        zigZag(arr);
        System.out.println("The zigzag array is : " + Arrays.toString(arr));
    }
}
