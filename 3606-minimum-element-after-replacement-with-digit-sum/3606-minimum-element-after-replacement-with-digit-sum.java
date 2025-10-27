class Solution {
    public int minElement(int[] nums) {
        // ArrayList<Integer> ans=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     String s=nums[i]+"";
        //     int n=0;
        //     for(int j=0;j<s.length();j++){
        //         n+=s.charAt(j)-'0';
        //     }
        //     ans.add(n);
        // }
        // Collections.sort(ans);
        // return ans.get(0);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            while(nums[i]>0){
                int digit = nums[i] % 10;
                sum+=digit;
                nums[i]/=10;
            }
            min = Math.min(min,sum);
        }
        return min;
    }
}