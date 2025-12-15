package programmers;

import java.util.*;

public class 문자열계산하기0lv {
    static public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        answer = Integer.parseInt(str[0]);
        Queue<String> q = new LinkedList<>();
        Collections.addAll(q, str);

        while(!q.isEmpty()) {
            String temp = q.poll();
            if(temp.equals("+")) {
                answer += Integer.parseInt(q.poll());
            }else if(temp.equals("-")) {
                answer -= Integer.parseInt(q.poll());
            }
        }

        return answer;
    }
}
