package W1;

import java.util.Scanner;

/*
점수 중 최댓값을 M이라고 하자
나머지 점수를  점수 / M * 100 으로 고쳤다.
새로운 점수들의 평균을 구하시오

첫재 줄에 시험본 과목의 개수 N이 주어진다 N<= 1000
둘쨰 줄에 현재 성적이 주어진다 100보다 작거나 같은 음이 아닌 정수
*/
public class B1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] score = new int[N];
        // 점수 입력 받기
        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        // 최댓값 구하기
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]){
                max = score[i];
            }
        }

        // 새 점수로 바꾸기
        // double
        double[] newScore = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            newScore[i] = (double) score[i] /max * 100;
        }

        // 평균 구하기
        double avg = 0.0;
        for (int i = 0; i < newScore.length; i++) {
            avg += newScore[i];
        }

        System.out.println(avg/N);

    }
}
