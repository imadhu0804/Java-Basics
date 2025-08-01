import java.util.Scanner;

public class FindMissing {
    public static int missingElement(int[] arr,int n){
        int expectedSum = n*(n+1) / 2;
        int actualSum= 0;
        for(int num:arr){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The missing element in the array is: " + missingElement(arr,n));
        sc.close();
    }
}
