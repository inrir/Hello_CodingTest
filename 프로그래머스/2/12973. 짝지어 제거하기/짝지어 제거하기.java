import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        String[] splits = s.split("");
        
        // 알파벳 2개로 붙어있는 짝 삭제 -> 반복.
        
        Stack<String> stacks = new Stack<>();
        for(int i = 0; i < splits.length; i++)
        {
            if(!stacks.empty())
            {
                if(stacks.peek().equals(splits[i]))
                {
                    stacks.pop(); // 동일한 내용으로 삭제처리
                }
                else
                {
                    stacks.push(splits[i]);
                }
            }
            else
            {
                stacks.push(splits[i]);
            }
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(splits.length);
        
        if(stacks.empty())
        {
            answer = 1;
        }
        else
        {
            answer = 0;
        }

        return answer;
    }
}