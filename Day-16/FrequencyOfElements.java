import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            visited[i]=false;
        }

        System.out.println("Element frequencies: ");
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            int count=1;
            for(int j=i+1;j<n;j++){
               if( arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
               }
            }
            System.out.println("the occurances of "+ arr[i] +" is " + count + " times.");
        }
        sc.close();
    }
}
