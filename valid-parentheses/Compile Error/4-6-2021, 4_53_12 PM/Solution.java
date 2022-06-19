// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == "(" || s.charAt(i)=="{" || s.charAt(i) == "["){
                st.push(s.charAt(i));
            }
            else if(isempty(st)){
                return false;
            }
            else if ((s.charAt(i) == ")" && st.peek=="(") || (s.charAt(i)=="}" && st.peek=="{")|| (s.charAt(i)=="]" && s.peek =="[")){
                st.pop();
            }
            else{
                return false;
                 
             }        
        }
        if (isempty(st)){
            return true;
        }
        return false;          
        
    }
}