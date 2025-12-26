package programmers;

public class 캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {

        int x = 0; int y = 0;


        for(String input : keyinput) {
            if(input.equals("up")){
                if(y >= board[1]/2) continue;
                y++;
            }
            else if(input.equals("down")) {
                if(y <= -board[1]/2) continue;
                y--;
            }
            else if(input.equals("left")) {
                if(x <= -board[0]/2) continue;
                x--;
            }
            else if(input.equals("right")) {
                if(x >= board[0]/2) continue;
                x++;
            }
        }

        return new int[] {x, y};
    }
}