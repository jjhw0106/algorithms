package programmers;


public class 옹알이 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] can = new String[] {"aya", "ye", "woo", "ma"};
        for(String s : babbling) {
            for(String c : can) {
                s = s.replace(c, " ");
            }

            s= s.replace(" ", "");
            if(s.isEmpty()) {
                answer++;
            }
        }


        return answer;
    }
}
