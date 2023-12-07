package W2.ClassPractice;
// https://school.programmers.co.kr/learn/courses/30/lessons/181883
/* 정수 배열 arr, 2차원 정수 배열 queries
queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 */
public class Solution181883 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            for (int i = s; i < e -1; i++) {
                arr[i] +=1;
            }
        }
        return arr;
    }
}
