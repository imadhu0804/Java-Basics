
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElements {
    public static List<Integer> commonElements(int[] arr1,int[] arr2,int[] arr3){
        List<Integer> result=new ArrayList<>();
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length&&k<arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                result.add(arr1[i]);
                i++;j++;k++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr3[k]){
                j++;
            }else{
                k++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        int[] arr2= new int[k];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int l =sc.nextInt();
        int[] arr3= new int[l];
        for(int i=0;i<n;i++){
            arr3[i]=sc.nextInt();
        }
        System.out.println("The common elements are : " + commonElements(arr1, arr2, arr3));
        sc.close();
    }
}
