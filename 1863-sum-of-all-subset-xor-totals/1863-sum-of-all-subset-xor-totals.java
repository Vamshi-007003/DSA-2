class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int or=0;
        for(int i=0;i<n;i++){
            or|=nums[i];
        }
        return or*(int)Math.pow(2,n-1);
    }
}