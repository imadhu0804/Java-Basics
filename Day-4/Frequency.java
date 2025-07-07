import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        System.out.println("Frequencies: ");
        for(int key:map.keySet()){
            System.out.println(key + " ocuurs "+ map.get(key)+"times");
        }
        sc.close();
    }
}
