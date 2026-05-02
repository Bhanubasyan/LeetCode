class Solution {
    public boolean isNumber(String s) {
         s = s.trim();
        boolean seenDigit = false ;
        boolean seenDot = false ;
        boolean seenE = false ;

        for(int i =0 ; i<s.length();i++){
        
        char ch = s.charAt(i);

     // digit 
        if(Character.isDigit(ch)){
            seenDigit = true;

        }

        //+ or -

        else if(ch == '+' || ch == '-'){
            if(i>0 && ((s.charAt(i-1) != 'e') && (s.charAt(i-1) != 'E')))return false ;
        }

        // dot . 
       else if (ch == '.'){
       if(seenDot || seenE)return false ;
       seenDot = true;
       }

     // e or E  
        else if(ch == 'e' || ch == 'E'){
            if(!seenDigit || seenE) return false ;

            seenE = true;
            seenDigit = false ;

        }
else{
    return false;
}


        }
       return seenDigit;
    }
}