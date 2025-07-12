import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
    public static void isFrequency(String s1){
        Map<Character,Integer> freq= new HashMap<>();
        for( char c: s1.toCharArray()){
            if(c!=' ')
                freq.put(c,freq.getOrDefault(c,0)+1);
        }
        System.out.println("Character frequencies: "+ freq);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        isFrequency(s1);
    }
}
