class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]-nums[i]==diff){
                    for(int k=0;k<n;k++){
                        if(nums[k]-nums[j]==diff) count++;
                    }
                }
            }
        }
        return count;
    }
}