import java.util.Scanner;

class ArrayTraversal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        sc.close();
    }
}
