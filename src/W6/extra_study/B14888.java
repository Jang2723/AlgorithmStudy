package W6.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatCodePointException;

// https://www.acmicpc.net/problem/14888
// 연산자 끼워넣기 -BF-실버1
/*
n개의 수로 이루어진 수열 a1....an
수와 수 사이에 끼워 넣을 수 있는 n-1개의 연산자가 주어진다..
연산자는 + - * / 만 주어진다.
주어진 수의 순서를 바꾸면 안된다.
1 2 3 4 5 6
+ + - * / 가 주어진 경우 총 60가지의 식을 만들 수 있다.
연산자의 우선 순위를 무시하고 앞에서부터 진행, 나눗셈은 몫만 취한다.
만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램
첫째 줄 수의 개수 n
둘째 줄 수열 an
셋쨰 줄에는 합이 n-1인 4개의 정수, 차례대로 + - * / 의 개수이다.
 */
public class B14888 {
    private static int max = Integer.MAX_VALUE;
    private static int min = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        // 숫자는 n개
        int[] numbers = new int[n];
        String[] numberString = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
        }

        // 연산자의 종류는 4개 + - * / 의 갯수를 operatorString에 입력받고
        String[] operatorStirng = reader.readLine().split(" ");
        // int 배열에 다시 저장
        // operators에는 + - * / 의 갯수가 각각 몇개 있는지 저장되어 있다.
        int[] operators = new int[]{
                Integer.parseInt(operatorStirng[0]),
                Integer.parseInt(operatorStirng[1]),
                Integer.parseInt(operatorStirng[2]),
                Integer.parseInt(operatorStirng[3])
        };
        // 순열을 돌린다.
        perm(n,numbers,operators);
        StringBuilder sb = new StringBuilder();
        sb.append(max)
                .append('\n')
                .append(min);
        System.out.println(sb);
    }

    // 순열 도입 메서드
    public static void perm(
            // 숫자의 총 개수, 수열, 연산자 갯수 배열
            int n, int[] numbers, int[] operators){
                                // 연산자의 갯수만큼 사이즈를 가진 배열
        permRecursive(n,numbers,operators,new int[n-1], 0);
    }

    public static void permRecursive(
            int n,int[] numbers,int[] operators,
            // 연산자 조합 저장용 배열
            int[] perm,
            // 현재 연산자를 넣어줄 칸
            int depth
    ){
        // 숫자의 갯수 - 1이 연산자 선택 횟수이다. = 연산자의 갯수는 원래부터 n-1개 였으므르
        if(depth == n-1){
            // 연산자 조합대로 계산해본다.
            int result = getResult(n,numbers,perm);
            // 최대와 최소 갱신
            max = Math.max(result,max);
            min = Math.min(result,min);
        }
        else{
            // 연산자 4종류 중 하나를 고를 예정 0: + , 1: - ,  2: *, 3: /
            for (int i = 0; i < 4; i++) {
                // 만약 이미 그 연산자를 다 소진했다면,없다면 스킵
                if (operators[i] == 0) continue;
                // 아직 남아있는 경우
                // 사용한 연산자의 갯수를 감소시키고
                operators[i]--;
                // 연산자 조합 저장 배열에 i값에 따라  연산자가 달라짐
                perm[depth] = i;
                permRecursive(n,numbers,operators,perm,depth+1);
                // 왜 증가시켜주지?
                operators[i]++;
            }
        }
    }

    // 주어진 연산자(perm)를 순회하며 그 종류에 따라 계산한다.
    private static int getResult(int n, int[] numbers, int[] perm){
        // 첫 숫자를 받고
        int result = numbers[0];

        // 각각 연산자 순회
        for (int i = 0; i < n; i++) {
            // 종류에 따라 적용할 계산이 변동된다.
            switch (perm[i]) {
                case 0:
                    result += numbers[i + 1];
                    break;
                case 1:
                    result -= numbers[i + 1];
                    break;
                case 2:
                    result *= numbers[i + 1];
                    break;
                case 3:
                    result /= numbers[i + 1];
                    break;
            }
        }
        return result;

    }
}
