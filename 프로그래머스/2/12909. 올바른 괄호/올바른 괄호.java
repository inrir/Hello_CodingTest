import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // 하나씩 담되, 정수형으로 표시 처리
        int count = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
            }
            else if(s.charAt(i) == ')')
            {
                count--;
            }
            // ) 선 적재에 대해서 방어로직
            if(count < 0) 
            {
                answer = false;
                break;
            }
        }
        
        
        // 최종 나머지 확인 후 결정.
        if(count == 0)
        {
            answer = true;
        }
        else 
        {
            answer = false;
        }
        
        
        
        
        
        return answer;
    }
}