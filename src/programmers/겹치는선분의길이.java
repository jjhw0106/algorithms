package programmers;

import java.util.Arrays;
import java.util.Collections;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        int answer = 0;


        for(int i=-100; i<100; i++) {
            int count = 0;
            if(check(i, lines[0])) {
                count ++;
            }
            if(check(i, lines[1])) {
                count ++;
            }
            if(check(i, lines[2])) {
                count ++;
            }
            if(count >= 2) answer++;
        }

        return answer;
    }
    private boolean check(int n, int[] line) {
        return n >= line[0] && n < line[1];
    }
}
