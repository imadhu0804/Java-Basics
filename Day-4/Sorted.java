import java.util.Scanner;

class Sorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=1;i<n;i++){
            if(arr[1]<arr[i-1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}