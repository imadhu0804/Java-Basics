import java.util.Scanner;
public class LargestofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println("First number is larger: " + n1);
        }
        else if(n2>n1){
            System.out.println("Second number is larger: " + n2);
        }
        else{
            System.out.println("Both numbers are equal: " + n1);
        }
    }
}
