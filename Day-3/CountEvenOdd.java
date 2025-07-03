
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int evenCount = 0;
        int oddcount=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                evenCount++;
            }else{
                oddcount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddcount);
        sc.close();
    }
}
