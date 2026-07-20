class Solution {
    int start=0,maxlen=0;
    public void expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            if(right-left+1>maxlen){
                maxlen=right-left+1;
                start=left;
            }
            left--;
            right++;
        }
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            expand(s,i,i);//odd len
            expand(s,i,i+1);//even len
        }
        return s.substring(start,start+maxlen);
    }
}