import java.util.Scanner;

public class StringPangram {
    public static boolean  isPangram(String s){
        s=s.toLowerCase();
        boolean[] mark= new boolean[26];
        for(char c: s.toCharArray()){
            if(c >= 'a' && c<='z'){
                mark[c - 'a'] =true;
            }
        }
        for(boolean b:mark){
            if(!b) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Is Pangram: " + isPangram(s));
    }
}
