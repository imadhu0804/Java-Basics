import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evenCount=0;
        int oddCount=0;
        for(int num:arr){
            if(num%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even count is "+ evenCount + " Odd count is "+ oddCount);
        sc.close();
    }
}
