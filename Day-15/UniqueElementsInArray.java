import java.util.Scanner;

public class UniqueElementsInArray {
    public static void printUniqueElements(int[] arr){
        boolean isUnique;
        for(int i=0;i<arr.length;i++){
            isUnique=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(arr[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The uniques elements in the array are: ");
        printUniqueElements(arr);
        sc.close();
    }
}
