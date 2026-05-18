class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int currStreak = 1, maxStreak = 1;
        for(int i = 1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1) {
                currStreak++;
            }else {
                currStreak = 1;
            }
            maxStreak = Math.max(currStreak,maxStreak);
        }
        return maxStreak;
    }
}
