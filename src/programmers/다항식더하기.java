package programmers;

public class 다항식더하기 {
    public String solution(String polynomial) {
        String answer = "";

        String[] poly = polynomial.split(" ");
        int temp = 0;
        int temp2 = 0;
        for(String s : poly) {
            if(s.equals("+")) continue;
            if(s.contains("x")) {
                if(s.equals("x")) {
                    s = s.replace("x","1");
                }
                else {
                    s = s.replace("x", "");
                }
                temp += Integer.parseInt(s);
            }
            else {
                temp2 += Integer.parseInt(s);
            }
        }

        if(temp == 0) {
            answer = String.valueOf(temp2);
        } else if(temp2 == 0) {
            if(temp == 1) {
                answer = "x";
            } else {
                answer = String.valueOf(temp) + "x";
            }
        } else {
            if(temp == 1) {
                answer = "x" + " + " + temp2;
            }
            else {answer = String.valueOf(temp) + "x" + " + " + temp2;}
        }

        return answer;
    }
}