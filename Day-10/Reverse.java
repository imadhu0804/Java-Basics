import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String reversed="";
        for(int i=s1.length()-1;i>=0;i--){
            reversed+=s1.charAt(i);
        }
        System.out.println(reversed);
        sc.close();
    }
}
