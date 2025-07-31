
import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }

        return (count > nums.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Majority Element: " + majorityElement(nums));
    }
}
