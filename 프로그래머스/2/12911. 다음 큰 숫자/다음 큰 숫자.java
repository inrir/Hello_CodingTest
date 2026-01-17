class Solution {
    public int solution(int n) {
        
        // bitCount() -> 1의 갯수 판단.
        int compare = Integer.bitCount(n);
        int answer = n; // NEXT 조건 맞는 데이터
        answer++;
        while(true)
        {
            if(Integer.bitCount(answer) == compare)
                break;
            answer++;
        }
       
        
        return answer;
    }
}