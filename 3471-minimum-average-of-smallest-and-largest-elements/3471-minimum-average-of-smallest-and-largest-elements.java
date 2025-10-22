class Solution {
    public double minimumAverage(int[] nums) {
        
        Arrays.sort(nums);
        double avg=50;
        int i=0,j=nums.length-1;
        while(i<j){
            double x=nums[i]+nums[j];
            avg=Math.min(avg,x/2.0);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
        return avg;
    }
}