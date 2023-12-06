package W2;

import java.util.Scanner;

//https://www.acmicpc.net/problem/5597
// 과제 안 내신 분..? - 1차원 배열
/*
입력은 총 28줄로 과제 제출자의 출석번호가 주어진다.
출석번호에 중복은 없다. 제출 안한 학생의 출석번호를 순서대로 출력
*/
public class B5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 학생 30명의 출석번호 배열
        int[] nums = new int[31];
        // 낸 사람은 1로 표현
        for (int i = 0; i < 28; i++) {
            int ok = sc.nextInt();
            nums[ok] = 1;
        }
        // 안낸 사람 검사
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == 1) continue;
            else System.out.println(i);
        }
    }
}
