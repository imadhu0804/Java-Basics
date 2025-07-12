import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s1){
        s1=s1.toLowerCase().replaceAll("\\s1", "");
        int i=0; 
        int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i++)!=s1.charAt(j--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        System.out.println("IsPalindrome : " + isPalindrome(s1));
    }
}
