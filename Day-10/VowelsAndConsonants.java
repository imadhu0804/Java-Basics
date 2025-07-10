import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        int vowels=0;
        int consonants =0;
        s1=s1.toLowerCase();
        for(char c:s1.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c)!=-1) vowels++;
                else consonants++;
            }
        }
        System.out.println("vowels: " +vowels +", consonants: "+consonants);
        sc.close();
    }
}
