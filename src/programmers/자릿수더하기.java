package programmers;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        for(Character c : String.valueOf(n).toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }


        return answer;
    }
}
