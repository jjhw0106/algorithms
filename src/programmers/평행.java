package programmers;

import java.util.Arrays;

public class 평행 {
    public int solution(int[][] dots) {
        int answer = 0;

        // 두점 선택해서 연결
        // 나머지 두개 연결
        // 두 개 기울기 비교해서 같으면 count +1

        if(checkDegree(dots[0], dots[1], dots[2], dots[3])) return 1;
        if(checkDegree(dots[0], dots[2], dots[1], dots[3])) return 1;
        if(checkDegree(dots[0], dots[3], dots[1], dots[2])) return 1;

        return answer;
    }

    private boolean checkDegree(int[] d1, int[] d2, int[] d3, int[] d4) {

        int leftSide = (d2[0] - d1[0]) * (d4[1] - d3[1]);
        int rightSide = (d2[1] - d1[1]) * (d4[0] - d3[0]);

        return leftSide == rightSide;
    }
}
