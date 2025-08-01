import java.util.*;

public class Leaders {
    public static List<Integer> leaderArray(int[] arr){
        List<Integer> leaders= new ArrayList<>();
        int n=arr.length;
        int maxFromRight=arr[n-1];
        leaders.add(maxFromRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxFromRight){
                maxFromRight=arr[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(leaderArray(arr));
        sc.close();
    }
}
