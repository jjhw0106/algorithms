package programmers;

import java.util.Arrays;

public class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;

        int yLen = board.length;
        int xLen = board[0].length;
        int[] dy = new int[]{-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dx = new int[]{0, 0, -1, 1, -1, 1, 1, -1};


        for(int i=0; i<yLen; i++) {
            for(int j=0; j<xLen; j++) {
                if(board[i][j] == 1) {
                    for(int k=0; k<8; k++) {
                        int ny = i + dy[k];
                        int nx = j + dx[k];
                        if( ny >= 0 && nx >= 0 && ny <= yLen - 1 && nx <= xLen - 1) {
                            if(board[ny][nx] == 0) {
                                board[ny][nx] = 9;
                            }
                        }
                    }
                }
            }
        }
        for (int[] ints : board) {
            for (int j = 0; j < xLen; j++) {
                if (ints[j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
