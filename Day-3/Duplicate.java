import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> seen= new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int num:arr){
            if(seen.contains(num)){
                duplicates.add(num);
            }else{
                seen.add(num);
            }
        }
        if(duplicates.isEmpty()){
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}
