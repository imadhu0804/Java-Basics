
import java.util.Scanner;

public class Descending {
    public static void descendingNto1(int n){
        if(n==0)
            return;
        System.out.print(n);
        descendingNto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        descendingNto1(n);
        sc.close();
    }
}
