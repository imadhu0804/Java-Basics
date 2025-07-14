import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<2){
            System.out.println("The array should have atleast 2 elements");
            return;   
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }
            else if (num>second && num!=first) {
                second=num;
            }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("second largest element is not found");
        }else{
            System.out.println("The second largest element is :" + second);
        }
        sc.close();
    }
}
