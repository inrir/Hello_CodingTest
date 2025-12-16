import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // 누적된 값이 최소가 되도록. 어떻게 하지??
        // 제일 큰 것과 작은 것을 곱하기.
        Arrays.sort(A);
        Arrays.sort(B);
        int len = A.length;
        
        for(int i = 0; i < len; i++)
        {
            answer += A[i] * B[(len - 1) - i];
        }
        

        
        
        System.out.println("Hello Java");

        return answer;
    }
}