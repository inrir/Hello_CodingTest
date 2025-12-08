class Solution {
    public int solution(int n) {
        int answer = 1; // 1부터 시작
        
        while(n > answer)
        {
            if(n % answer == 1)
            {
                break;
            }
            answer++;
        }
        
        
        return answer;
    }
}