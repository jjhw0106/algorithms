import programmers.OX퀴즈lv0;
import programmers.문자열안에문자열lv0;
import programmers.제곱수판별하기lv0;
import programmers.세균증식lv0;
import programmers.문자열정렬하기2lv0;
import programmers.칠의개수;
import programmers.잘라서배열로저장하기;
import programmers.중복된숫자개수;
import programmers.머쓱이보다키큰사람;
import programmers.직사각형넓이구하기;
import programmers.캐릭터의좌표;
import programmers.최댓값만들기2;
import programmers.다항식더하기;
import programmers.숨어있는숫자의덧셈2;
import programmers.안전지대;
import programmers.삼각형의완성조건2;
import programmers.외계어사전;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        배열의유사도0lv.solution(new String[]{"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"});
//        숫자찾기0lv.solution(29183, 2);
//        OX퀴즈lv0.solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
//
//        // 문자열안에문자열
//        System.out.println("문자열안에문자열: " + new 문자열안에문자열lv0().solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
//
//        // 제곱수판별하기
//        System.out.println("제곱수판별하기: " + new 제곱수판별하기lv0().solution(144));
//
//        // 세균증식
//        System.out.println("세균증식: " + new 세균증식lv0().solution(2, 10));
//
//        // 문자열정렬하기2
//        System.out.println("문자열정렬하기2: " + new 문자열정렬하기2lv0().solution("Bcad"));
//
//        // 칠의개수
//        System.out.println("칠의개수: " + new 칠의개수().solution(new int[]{7, 77, 17}));
//
//        // 잘라서배열로저장하기
//        System.out.println("잘라서배열로저장하기: " + Arrays.toString(new 잘라서배열로저장하기().solution("abcdef123", 3)));
//
//        // 중복된숫자개수
//        System.out.println("중복된숫자개수: " + new 중복된숫자개수().solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
//
//        // 머쓱이보다키큰사람
//        System.out.println("머쓱이보다키큰사람: " + new 머쓱이보다키큰사람().solution(new int[]{149, 180, 192, 170}, 167));

        // 직사각형넓이구하기
//        System.out.println("직사각형넓이구하기: " + new 직사각형넓이구하기().solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
//
//        // 캐릭터의좌표
//        System.out.println("캐릭터의좌표: " + Arrays.toString(new 캐릭터의좌표().solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
//
//        // 최댓값만들기2
//        System.out.println("최댓값만들기2: " + new 최댓값만들기2().solution(new int[]{1, 2, -3, -4, -5}));
//
//        // 다항식더하기
//        System.out.println("다항식더하기: " + new 다항식더하기().solution("3x + 7 + x"));

        // 숨어있는숫자의덧셈2
        System.out.println("숨어있는숫자의덧셈2: " + new 숨어있는숫자의덧셈2().solution("aAb1B2cC34oOp"));

        // 안전지대
        System.out.println("안전지대: " + new 안전지대().solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));

        // 삼각형의완성조건2
        System.out.println("삼각형의완성조건2: " + new 삼각형의완성조건2().solution(new int[]{3, 3}));

        // 외계어사전
        System.out.println("외계어사전: " + new 외계어사전().solution(new String[]{"p", "o", "s"}, new String[]{"soddd", "eocd", "qixm", "adio", "soo"}));
    }
}