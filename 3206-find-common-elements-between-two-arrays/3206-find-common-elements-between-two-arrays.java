class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[] =new int[2];
        HashMap<Integer,Integer> HP1=new HashMap<>();
        HashMap<Integer,Integer> HP2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            HP1.put(nums1[i],HP1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            HP2.put(nums2[i],HP2.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0;i<nums1.length;i++){
            if(HP2.containsKey(nums1[i])){
                ans[0]++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(HP1.containsKey(nums2[i])){
                ans[1]++;
            }
        }
        return ans;
    }
}