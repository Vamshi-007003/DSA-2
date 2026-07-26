class Solution {
    public int minBitFlips(int start, int goal) {
        int c=0;
        while(start !=0 || goal!=0){
            int b1=start&1;
            int b2=goal&1;
            if(b1!=b2)
            c++;
            goal=goal>>1;
            start=start>>1;
        }
        return c;
    }
}