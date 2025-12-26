package programmers;

public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int answer = 0;

        int y = dots[0][0];
        int x = dots[0][1];

        for(int i=0; i<4; i++) {
             if(dots[i][0] != y) {
                 y = dots[i][0] - y;
                 break;
             }
        }
        for(int i=0; i<4; i++) {
             if(dots[i][1] != x) {
                 x = dots[i][1] - x;
                 break;
             }
        }

        return Math.abs(x*y);
    }
}