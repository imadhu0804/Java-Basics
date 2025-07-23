
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void countFrequency(int[] arr){
        Map<Integer,Integer> freqmap = new HashMap<>();
        for(int num: arr){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        System.out.println("Frequencies: ");
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countFrequency(arr);
        sc.close();
    }
}
