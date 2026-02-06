package programmers;

public class 치킨쿠폰 {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;

        while(chicken > 0) {
            chicken--;
            coupon++;
            if(coupon == 10) {
                answer++;
                coupon = 0;
                chicken++;
            }
        }

        return answer;
    }
}
