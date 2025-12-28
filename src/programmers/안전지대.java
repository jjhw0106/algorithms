package programmers;

public class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;

        for(int i=1; i<board[0].length-1; i++) {
            for(int j=1; j<board.length-1; j++) {
                if(board[i][j] == 1) {
                    board[i-1][j-1] = board[i-1][j-1] == 1 ? 1 : 9;
                    board[i-1][j] = board[i-1][j] == 1 ? 1 : 9;
                    board[i-1][j+1] = board[i-1][j+1]== 1 ? 1 : 9;
                    board[i][j-1] = board[i][j-1]== 1 ? 1 : 9;
                    board[i][j+1] = board[i][j+1]== 1 ? 1 : 9;
                    board[i+1][j-1] = board[i+1][j-1]== 1 ? 1 : 9;
                    board[i+1][j] = board[i+1][j] == 1 ? 1 : 9;
                    board[i+1][j+1] = board[i+1][j+1] == 1 ? 1 : 9;
                }
            }
        }

        for(int i=0; i<board[0].length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}
