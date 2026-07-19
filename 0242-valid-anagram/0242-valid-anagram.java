class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(s.length()!=t.length())
        return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(t.charAt(i)))
            map.put(t.charAt(i),map.get(t.charAt(i))-1);
            else
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        for(char ch:map.keySet()){
            if(map.get(ch)!=0)
            return false;
        }
        return true;
    }
}