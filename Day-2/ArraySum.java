import java.util.Scanner;

class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("The sum of the elements in the array is :"+sum);;
        sc.close();
    }
}
