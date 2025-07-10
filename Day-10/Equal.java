import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("Given strings are equal.");
        }else{
            System.out.println("They are not equal.");
        }
        sc.close();
    }
}
