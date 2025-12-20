package programmers;

public class 숫자찾기lv0 {
    static public int solution(int num, int k) {

        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);

        return strNum.indexOf(strK) == -1 ? -1 : strNum.indexOf(strK) + 1;
    }
}
