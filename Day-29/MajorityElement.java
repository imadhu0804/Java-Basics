import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] arr){
        int count =0,candidate=-1;
        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            count+=(num==candidate) ? 1:-1;
        }
        count=0;
        for(int num:arr){
            if(num==candidate) count++;
        }
        return (count> arr.length/2) ? candidate :-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Majority element : " + majorityElement(arr));
    }
}
