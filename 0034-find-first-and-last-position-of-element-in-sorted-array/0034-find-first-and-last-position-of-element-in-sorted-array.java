class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        int a[] = new int[2];
        a[0]=-1;
        a[1]=-1;        
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                a[0]=mid;
                h=mid-1;
            }else if(target<nums[mid]){
                h=mid-1;
                }
            else{
                l=mid+1;
                }
        }
        int lo=0,hi=n-1;
         while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                a[1]=mid;
                lo=mid+1;
            }else if(target<nums[mid]){
                hi=mid-1;
                }
            else{
                lo=mid+1;
                }
        }
        return a;
    }
}