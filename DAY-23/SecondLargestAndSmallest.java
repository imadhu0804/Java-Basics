
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static void findSecondLargestAndSmallest(int[] arr,int n){
        Arrays.sort(arr);
        int smallest = arr[0], secondsmallest=-1;
        int largest =arr[n-1], secondlargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]!=smallest){
                smallest=arr[i];
                break;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                largest=arr[i];
                break;
            }
        }
        System.out.println("The second smallest is : "+ smallest);
        System.out.println("The second largest is : " + largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findSecondLargestAndSmallest(arr,n);
        sc.close();
    }
}
