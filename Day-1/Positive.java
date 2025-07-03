
import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        if(n1>0){
            System.out.println("Positive");
        }else if(n1<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
