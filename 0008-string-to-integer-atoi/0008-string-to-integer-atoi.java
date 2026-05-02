class Solution {
    public int myAtoi(String s) {
        int i =0 ; 
        int n = s.length();

        while ( i < n && ( s.charAt(i) == ' ')){
            i++;

        }

        int sign = 1;
        if(i < n && (s.charAt(i) == '+'|| s.charAt(i) == '-') ){
            if( s.charAt(i) == '-') sign =-1;
            else sign = +1;
            i++;
        }


            int num =0;
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;

        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
           
           if(num > (max - digit)/10){
            return (sign == 1) ? max : min;
           }

           num = num * 10 + digit;
           i++;

        }
        return sign * num;

    }
}