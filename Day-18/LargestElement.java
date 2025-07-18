
import java.util.Scanner;

public class LargestElement {
    public static int findLargest(int[] arr){
        int max=0;
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest = findLargest(arr);
        System.out.println("the largest element is " + largest);
        sc.close();
    }
}
