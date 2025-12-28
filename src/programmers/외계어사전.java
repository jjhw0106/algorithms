package programmers;

import java.util.Arrays;

public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {

        String str = Arrays.toString(Arrays.stream(spell).sorted().toArray());
        char[] sArr = String.join("",spell).toCharArray();
        Arrays.sort(sArr);
        String sortedStr = new String(sArr);

        for(String d : dic) {
            char[] cArr = d.toCharArray();
            Arrays.sort(cArr);

            d = new String(cArr);
            if(sortedStr.equals(d)) return 1;
        }

        return 2;
    }
}
