import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> d = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (d.contains(nums[i])) {
                return true;
            }
            d.add(nums[i]);
            if (d.size() > k) {
                d.remove(nums[i - k]);
            }
        }
        return false;
    }
}
