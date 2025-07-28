import java.util.Scanner;

public class SortedAndRotated {
    public static boolean sortedAndRotated(int[] arr){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]) count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is sorted and rotated : "+ sortedAndRotated(arr));
    }
}
