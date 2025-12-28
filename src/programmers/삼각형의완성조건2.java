package programmers;

public class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        int answer = 0;
        int min = Math.min(sides[0],sides[1]);
        int max = Math.max(sides[0],sides[1]);

        for(int i=1; i<=1000; i++) {
            if(i >= min + max) break;

            if(i < max) {
                if(i+min > max) { answer++;}
            } else {
                if(min+max > i) { answer++;}
            }
        }

        return answer;
    }
}
