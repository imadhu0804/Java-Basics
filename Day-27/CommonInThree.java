import java.util.*;

public class CommonInThree {
    public static List<Integer> countThree(int[] arr1,int[] arr2,int[] arr3){
        int i=0,j=0,k=0;
        List<Integer> result= new ArrayList<>();
        while(i<arr1.length && j<arr2.length && k<arr3.length){
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
        int n1= sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2= sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int n3= sc.nextInt();
        int[] arr3=new int[n3];
        for(int i=0;i<n1;i++){
            arr3[i]=sc.nextInt();
        }
        System.out.println("The common elements in the three arrays are : " + countThree(arr1, arr2, arr3));
        sc.close();
    }
}
