package programmers;

public class 유한소수판별하기 {
    public int solution(int a, int b) {
        // 최대 공약수 구하기
        // a, b 최대공약수로 나누기
        // 최대공약수로 나눈 b를 2, 5로 끝까지 나누기
        // 결과가 1이면 true
        int gcd = gcd(a, b);
        int bt = b/gcd;
        while(bt % 2 == 0) {
            bt /= 2;
        }
        while(bt % 5 == 0) {
            bt /= 5;
        }

        if (bt == 1) {
            return 1;
        }

        return 2;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b); // 반드시 return을 붙여줘야 결과가 전달됩니다.
    }
}
