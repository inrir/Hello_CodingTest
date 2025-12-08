class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n]; // 길이 설정.
        int time = 0; // 제한길이
        long value = x;
        while(time < n)
        {
            answer[time] = value;
            value += x;
            time++;
            
        }
        
        
        return answer;
    }
}