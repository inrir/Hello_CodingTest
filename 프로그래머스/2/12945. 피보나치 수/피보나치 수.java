class Solution {
    public int solution(int n) {
        int answer = 0;
        n = n%1234567; // condition1
        if(n <= 0) return 0;
        if(n <= 2) return 1;
        int cond1 = 0;
        int cond2 = 1;
        
        
        for(int i = 2; i <= n; i++)
        {
            answer = (cond1 + cond2) % 1234567;
            cond1 = cond2;
            cond2 = answer;
        }
        
        
        return answer;
    }
}