
import java.util.Scanner;

public class CountVowels {
    static int countVowels(String s){
        int count =0;
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int vowels = countVowels(s);
        System.out.println("count of vowels is: " + vowels);
        sc.close();
    }
}
