class Solution {
    public boolean check(int[] nums, int k) {
        long have = 0;
        for (int n : nums) {
            if (n <= k) {
                have += k - n;
            } else {
                if (have < n - k)
                    return false;
                else
                    have -= (n - k);
            }
        }
       
        return true;
    }

    public int minimizeArrayValue(int[] nums) {
        int left = 0, right = Arrays.stream(nums).max().getAsInt();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(nums, mid))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
