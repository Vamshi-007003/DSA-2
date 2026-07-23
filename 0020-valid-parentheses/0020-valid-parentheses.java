class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack =new Stack();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            stack.push(s.charAt(i));
            else{
                if(stack.isEmpty()){
                    return false;
                }
            char ch=s.charAt(i);
            char top=stack.peek();
            if(ch==']' && top=='[' || ch==')' && top=='(' || ch=='}' && top=='{')
            stack.pop();
            else
            return false;
            }
        }
        return stack.isEmpty();
    }
}