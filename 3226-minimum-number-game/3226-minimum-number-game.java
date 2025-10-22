class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int x=0;
        for (int i=0;i<nums.length; i += 2) {
            int alice=nums[i];
            int bob=nums[i+1];
            ans[x] = bob;
            ans[x+1] = alice;
            x+=2;

        }
        return ans;
    }
}