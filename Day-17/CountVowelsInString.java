import java.util.Scanner;

public class CountVowelsInString {
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int result = countVowels(input);
        System.out.println("Number of vowels: " + result);
        sc.close();
    }
}
