import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to count: ");
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println("The occurances of the " + key + " in array is "+ count);
        sc.close();
    }
}
