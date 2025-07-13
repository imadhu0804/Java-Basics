import java.util.Arrays;
import java.util.Scanner;

public class ZerosToEnd {
    public static void moveZeroes(int[] arr){
        int index=0;
        for(int num: arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        moveZeroes(arr);
        System.out.println("The array after moving zeroes is: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
