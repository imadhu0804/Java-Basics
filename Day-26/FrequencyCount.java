import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void freqCount(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            System.out.println(num+ " " +map.get(num));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        freqCount(arr);
    }
}
