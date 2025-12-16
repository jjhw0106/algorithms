package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기lv0 {
    public int[] solution(int n, int[] numlist) {
//
//        ArrayList<Integer> list = new ArrayList();
//
//        for(int num : numlist) {
//            if(num%n == 0) list.add(num);
//        }


        return Arrays.stream(numlist).filter(i-> i%n==0).toArray();
    }
}
