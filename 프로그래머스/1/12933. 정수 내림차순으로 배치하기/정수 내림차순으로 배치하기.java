import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // 숫자를 문자단위로 분리하기
        String str = Long.toString(n);
        // 문자를 정렬하기
        String[] strArr = str.split("");  // 문자 단위 배열 변경
        Arrays.sort(strArr, Collections.reverseOrder());
        // 문자를 숫자로 변환하기.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArr.length; i++)
        {
            sb.append(strArr[i]);
        }
        answer = Long.parseLong(sb.toString());
        
        
        return answer;
    }
}