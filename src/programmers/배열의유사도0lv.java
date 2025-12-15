package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 배열의유사도0lv {
    static public int solution(String[] s1, String[] s2) {
        int answer = 0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s1));

        // ArrayList contains 메소드 사용
        for(String s : s2) {
            if(list.contains(s)) answer ++;
        }

//        HashMap<String, Integer> map = new HashMap<>();
//        for(String s : s1) {
//            map.put(s, 1);
//        }
//        for(String s : s2) {
//            map.put(s, map.getOrDefault(s, 0)+1);
//        }
//        for(String a : map.keySet()) {
//            if(map.get(a) == 2) answer++;
//        }

        return answer;
    }
}
