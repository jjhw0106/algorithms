package programmers;

import java.util.Arrays;

public class OX퀴즈lv0 {
    public static String[] solution(String[] quiz) {
        String[] answer = {};

        int a = 0;
        int b = 0;
        int sum = 0;
        int idx = 0;
        answer = new String[quiz.length];
        for(String str : quiz) {
            a = Integer.parseInt(str.split(" ")[0]);
            b = Integer.parseInt(str.split(" ")[1]+"1") * Integer.parseInt(str.split(" ")[2]);
            System.out.println(b);
            sum = Integer.parseInt(str.split(" ")[4]);

            if(sum == a+b) {answer[idx] = "O";}
            else {answer[idx] = "X";}

            idx++;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
