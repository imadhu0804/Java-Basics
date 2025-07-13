import java.util.Scanner;

public class ReverseWords {
    public static String isReversed(String s){
        String[] words =s.split(" ");
        StringBuilder sb= new StringBuilder();
        for( String word:words){
            sb.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Reversed words are: " + isReversed(s));
    }
}
