package W2;
// https://school.programmers.co.kr/learn/courses/30/lessons/181914
// 음이아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같다.
// 정수 문자열 number, 9로 나눈 나머지를 return하는 solution작성
public class Solution181914 {
    public int solution(String number) {
        int sum = 0 ; // 각자리의 숫자의 합 저장 변수
        // 수가 너무 크면 문제가 생김
        String[] num = number.split(""); // 한글자씩 저장
        for(String str : num){
            sum += Integer.parseInt(str);
        }
        return sum %9 ;
    }
}
