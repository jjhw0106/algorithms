package programmers;

import java.util.*;

public class 문자열정렬하기2lv0 {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
