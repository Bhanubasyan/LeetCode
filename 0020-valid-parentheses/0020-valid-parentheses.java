class Solution {
    public boolean isValid(String s) {
        Stack<Character> st =new Stack<>();

       
        for(char ch : s.toCharArray()){

             // push opening braaces
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
             
             // closing braces
            else{

             // if stack is empty
             if(st.isEmpty())return false;

            

            //chek closing braces

            char top = st.pop();

            if(ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{' ) return false ;
        }
        }

        return st.isEmpty();

    }
}