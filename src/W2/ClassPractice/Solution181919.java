package W2.ClassPractice;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181919
// 콜라츠 수열 만들기
public class Solution181919 {
    // 현재 값이 x이면 x가 짝수일 때는 2로 나누고 홀수면 3 * x + 1로 바꾸는 계산을 반복하면
    // 언젠가는 반드시 1이 되는지 묻는 문제
    // 1000보다 작거나 같은 수에 대해서는 언젠가 1에 도달
    // 임의의 수 n -> 콜라츠 수열 리턴
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1) {
            if (n % 2 == 0) {
                // 짝수이면 2로 나누기
                n /= 2;
            } else {
                // 홀수면 3 * x + 1
                n = 3 * n + 1;
            }
            list.add(n);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
