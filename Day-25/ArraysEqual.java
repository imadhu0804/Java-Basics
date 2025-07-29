
import java.util.*;

public class ArraysEqual {
    public static boolean arraysAreEqual(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length) return false;
        Map<Integer,Integer> map =new HashMap<>();
        for(int num: arr1){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int num:arr2){
            if(!map.containsKey(num) || map.get(num)==0) return false;
            map.put(num,map.get(num)-1);
        }
        return true;
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
        System.out.println("The given arrays are Equal : " + arraysAreEqual(arr1, arr2));
        sc.close();
    }
}
