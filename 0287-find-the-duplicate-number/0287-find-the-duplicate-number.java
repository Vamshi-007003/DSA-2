class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int count[] = new int[n+1];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(count[i]>=2)
            return i;
        }
        return -1;
    }
}