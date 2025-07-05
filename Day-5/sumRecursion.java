
import java.util.Scanner;

public class sumRecursion {
    public static int sumUsingRecursion(int n){
        if(n==0)
            return 0;
        return n+ sumUsingRecursion(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumUsingRecursion(n));
        sc.close();
    }
}
