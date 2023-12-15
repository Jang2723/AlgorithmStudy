package W3.extraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14501
// 퇴사,BF
public class B14501 {
    // 최대 이익을 저장하는 정적 변수
    private static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        // n+1일째 퇴사, n일 동안 최대한 많은 상담
        // 상담 완료하는데 걸리는 시간 Ti, 상담 했을 때 받을 수 있는 금액 Pi
        // 최대 수익 구해라 // 첫째줄n
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] councilInfo = new int[n+1][];
        for (int i = 0; i < n; i++) {
            String[] tp=br.readLine().split(" ");
            councilInfo[i] = new int[]{
              Integer.parseInt(tp[0]),
              Integer.parseInt(tp[1])
            };
        }
        schedule(n,councilInfo,0,0);
        System.out.println(max);
    }

    public static void schedule(
            //퇴사해야 하는 날, 이날이 되면 재귀 끝
            int maxDays,
            // 상담 일정,
            int[][] councils,
            // 오늘, 상담 받을건지 말건지
            int currentDay,
            // 지금까지 이득
            int currentPay
    ){
        // 퇴사일이면
        if (currentDay == maxDays){
            // 정산
            max = Math.max(max,currentPay);
        }
        // 오늘 일하면 퇴사일을 넘어간다.
        else if (currentDay + councils[currentDay][0] > maxDays) {
            // 내일을 기약하자
            schedule(maxDays, councils, currentDay +1, currentPay);
        }
        // 오늘 일을 할지는 선택할 수 있다.
        else {
            schedule(
                    maxDays,
                    councils,
                    currentDay + councils[currentDay][0],
                    currentPay + councils[currentDay][1]
            );
            // 하지말자.
            schedule(
                    maxDays,
                    councils,
                    currentDay + 1,
                    currentPay
            );
        }

    }
}
