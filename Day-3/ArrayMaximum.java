
import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maximum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println(("The maximum element of array is: "+ maximum));
        sc.close();
    }
}
