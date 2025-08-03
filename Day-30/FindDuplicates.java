import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(findDuplicates(nums));
    }
}
