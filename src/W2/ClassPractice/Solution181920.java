package W2.ClassPractice;
// https://school.programmers.co.kr/learn/courses/30/lessons/181920
// 카운트 업
public class Solution181920 {
    public int[] solution(int start_num, int end_num) {
        // 정수 start_num와 end_num가 주어질 때,
        // start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        int[] answer = new int[end_num - start_num + 1];
        int count = start_num;
        for (int i = 0; i <end_num - start_num +1 ; i++) {
            answer[i] = count;
            count++;
        }
        return answer;
    }
}
