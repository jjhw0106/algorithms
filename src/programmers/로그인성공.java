package programmers;
public class 로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        for(String[] row : db) {
            if (id.equals(row[0]) && pw.equals(row[1])) return "login";
            if (id.equals(row[0]) && !pw.equals(row[1])) return "wrong pw";
        }
        return "fail";
    }
}
