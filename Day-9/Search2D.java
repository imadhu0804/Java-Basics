import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        boolean found=false;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==target){
                    System.out.println("Found at"+ "(" + i + ","+ j +")");
                    found=true;
                    count++;
                }
            }
        }
        if(!found){
            System.out.println("Element not found!");
        }else{
            System.out.println("Total occurances :"+ count);
        }
        sc.close();
    }
}
