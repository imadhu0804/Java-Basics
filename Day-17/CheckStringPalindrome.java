import java.util.Scanner;

public class CheckStringPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase(); 
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        boolean result = isPalindrome(input);
        System.out.println("Is the string a palindrome? " + result);
        sc.close();
    }
}
