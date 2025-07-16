
import java.util.Scanner;

public class CountVowelsConsonantsDigitsSpecials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input=sc.nextLine().toLowerCase();

        int vowel=0, consonant=0, digits=0, specials=0;
        for(char ch: input.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1) vowel++;
                else consonant++;
            }else if(Character.isDigit(ch)){
                digits++;
            }else if(!Character.isWhitespace(ch)){
                specials++;
            }
        }
        System.out.println("Vowels: "+ vowel);
        System.out.println("Consonants: "+ consonant);
        System.out.println("digits: "+ digits);
        System.out.println("Specials: "+ specials);
        sc.close();
    }
}
