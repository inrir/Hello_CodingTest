class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        System.out.println(absolutes.length);
        
        for(int i= 0; i < absolutes.length; i++)
        {
            if(signs[i] == false)
            {
                answer += -1 * absolutes[i];
            }
            else
            {
                answer += absolutes[i];
            }
                
        }
        return answer;
    }
}