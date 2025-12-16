class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 0 ~ 9 숫자 중 없는 수를 찾기
        int[] nums = new int[10];
        for(int i = 0; i < numbers.length; i++)
        {
            nums[numbers[i]] = 1;
        }
        
        // 나온 수를 더하기.
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                answer += i;
            }
        }
        
        
        return answer;
    }
}