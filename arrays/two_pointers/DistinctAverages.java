import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DistinctAverages 
{
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        Set<Double> set = new HashSet<>();

        while (left < right) {
            double currentAvg = (nums[left] + nums[right]) / 2.0;
            set.add(currentAvg);
            left++;
            right--;
        }

        return set.size();
    }
}