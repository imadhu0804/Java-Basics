import java.util.Scanner;

public class SumOfPrimesInArray {
    public static boolean isPrime(int num) {
        if(num<=1) return false;
        for(int i=2;i*i <=num;i++)
            if(num%i==0) return false;
        return true;
    }
    public static int primeSum(int[] arr){
        int sum=0;
        for(int num:arr){
            if(isPrime(num)) 
                sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result=primeSum(arr);
        System.out.println("The sum of primes is: " + result);
        sc.close();
    }
}
