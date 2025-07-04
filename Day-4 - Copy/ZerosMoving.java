
import java.util.Scanner;

public class ZerosMoving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<n){
            arr[index++]=0;
        }
        System.out.println("Arrays after moving zeroes : ");
        for(int num:arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
