class Solution {
    boolean solution(String s) {
        boolean answer = true;

     
        // 비교시 대소문자 구별하지 않음.
        s = s.toLowerCase(); // 소문자 변환
        
        // s 문자열의 하나씩 대조를 하면 어떨까? 
        int count_p = 0;
        int count_y = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'p')
                count_p++;
            if(s.charAt(i) == 'y')
                count_y++;
        }
            
        if(count_p == count_y)
            return true;
        else
            return false;

    }
}