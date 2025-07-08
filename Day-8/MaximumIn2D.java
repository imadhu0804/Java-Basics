import java.util.Scanner;

public class MaximumIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[][] arr=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
