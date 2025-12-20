import programmers.OX퀴즈lv0;
import programmers.문자열안에문자열lv0;
import programmers.제곱수판별하기lv0;
import programmers.세균증식lv0;
import programmers.문자열정렬하기2lv0;

public class Main {

    public static void main(String[] args) {
//        배열의유사도0lv.solution(new String[]{"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"});
//        숫자찾기0lv.solution(29183, 2);
//        OX퀴즈lv0.solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});

        // 문자열안에문자열
        System.out.println("문자열안에문자열: " + new 문자열안에문자열lv0().solution("ab6CDE443fgh22iJKlmn1o", "6CD"));

        // 제곱수판별하기
        System.out.println("제곱수판별하기: " + new 제곱수판별하기lv0().solution(144));

        // 세균증식
        System.out.println("세균증식: " + new 세균증식lv0().solution(2, 10));

        // 문자열정렬하기2
        System.out.println("문자열정렬하기2: " + new 문자열정렬하기2lv0().solution("Bcad"));
    }
}
