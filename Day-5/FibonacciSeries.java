
import java.util.Scanner;

public class FibonacciSeries {
    public static int findFibonacci(int n){
        if(n<=1)
            return n;
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findFibonacci(n));
        sc.close();
    }
}
