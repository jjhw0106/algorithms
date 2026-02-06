package programmers;

import java.util.HashMap;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int[] answer = {};

        int[] array = new int[score.length];
        answer = new int[array.length];
        for(int i=0; i<score.length; i++) {
            array [i] = score[i][0] + score[i][1];
        }

        for(int i=0; i<array.length; i++) {
            answer[i] = 1;
            for(int j=0; j<array.length; j++) {
                if(i != j) {
                    if(array[i] < array[j]) {
                        answer[i] ++;
                    }
                }
            }
        }


        return answer;
    }
}
