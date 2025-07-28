import java.util.*;

public class Countpairs {
    public static int countPairs(int[] arr,int k){
        Map<Integer,Integer> freq=new HashMap<>();
        int count=0;
        for(int num:arr){
            count+= freq.getOrDefault(k-num, 0);
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println("The count of the pairs is : " + countPairs(arr,k));
    }
}
