package programmers;

public class 숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()) {
            if(c < 65) {
                sb.append(c);
            } else {
                if(sb.length() != 0) {
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if(!sb.isEmpty()) answer+= Integer.parseInt(sb.toString());
        return answer;
    }
}
