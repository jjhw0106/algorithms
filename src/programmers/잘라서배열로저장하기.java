package programmers;

import java.sql.Array;
import java.util.ArrayList;


public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(char c : my_str.toCharArray()) {
            sb.append(c);

            if(sb.length() >= n) {
                list.add(sb.toString());
                sb.setLength(0);
                System.out.println(sb.toString());
            }
        }
        if(sb.length()>0) list.add(sb.toString());
        return list.toArray(new String[0]);
    }
}