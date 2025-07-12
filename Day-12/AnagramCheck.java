
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String s1,String s2){
        char[] arr1=s1.replaceAll("\\s1", "").toLowerCase().toCharArray();
        char[] arr2=s2.replaceAll("\\s2","").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("is Anagram: "+ isAnagram(s1, s2));
        sc.close();
    }
}
