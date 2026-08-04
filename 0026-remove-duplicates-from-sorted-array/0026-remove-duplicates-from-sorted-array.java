class Solution {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!list.contains(nums[i]))
            list.add(nums[i]);
        }
        int k=list.size();
        for(int i=list.size();i<n;i++){
            list.add(-1);
        }
        //int c[] = new int[n];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
            return k;
        
    }
}