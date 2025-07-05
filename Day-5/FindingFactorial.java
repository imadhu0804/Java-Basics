import java.util.Scanner;

public class FindingFactorial {
    public static void findFactorial(int n){
        if(n<0){
            System.out.println("enter valid input"); 
            return;
        }
        int fact =1;
        for(int i=n;i>=1;i--){
            fact *=i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findFactorial(n);
        sc.close();
    }
}