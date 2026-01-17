package programmers;

public class 저주의숫자3 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            if(n%3 == 0) {
                n++;
            }
            if(String.valueOf(n).contains("3")){
                n++;
            }
        }

        return n;
    }
}
