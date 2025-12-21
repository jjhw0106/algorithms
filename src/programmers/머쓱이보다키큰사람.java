package programmers;

import java.util.Arrays;
import java.util.Collections;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;

        array = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for(int a: array)   {
            if(a>height) {
                answer++;
            }
        }

        return answer;
    }
}
