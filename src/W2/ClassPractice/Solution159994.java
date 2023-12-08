package W2.ClassPractice;
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
// 카드뭉치
public class Solution159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 영어 단어가 적힌 카드 뭉치 두개
        // 한장씩 카드 사용, 사용한 카드는 다시 사용 x
        // 사용하지 않고 다음 카드로 넘어갈 수 x
        // 기존에 주어진 카드 뭉치의 단어 순서 바꿀수 x
        // 카드 배열 2개, 원하는 단어배열 goal
        // 만들 수 있다면 Yes, 없다면 No 출력
        int cnt1 = 0;
        int cnt2 = 0;
        String answer = "";

        for (String str : goal) {
            if (cnt1 < cards1.length && cards1[cnt1].equals(str)){
                // goal의 카드가 문자열 배열에 있다면
                cnt1++;
                continue;
            }
            if (cnt2 < cards2.length && cards2[cnt2].equals(str)){
                // goal의 카드가 문자열 배열에 있다면
                cnt2++;
                continue;
            }
            answer = "No";
            return answer;

        }
        answer = "Yes";
        return answer;
    }
}
