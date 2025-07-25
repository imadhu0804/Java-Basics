import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted = isSorted(arr);
        System.out.println("Is the given array sorted ?"+ sorted);
        sc.close();
    }
}
