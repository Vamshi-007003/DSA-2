class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        if(n<=2)
        return 0;
        int count[]= new int[3];
        int left=0,ans=0;
        for(int right=0;right<n;right++){
            count[s.charAt(right)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                ans+=n-right;
                count[s.charAt(left)-'a']--;
                left++;
            }
        } 
        return ans;
    }
}