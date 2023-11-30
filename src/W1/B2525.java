package W1;

import java.util.Scanner;

/*
첫째 줄에 현재 시각 입력  A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)
두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
종료되는 시각의 시와 분을 공백을 사이에 두고 출력 시는 0~23시 분은 0~59분
*/
public class B2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int mm = scanner.nextInt();

        // 요리되는 분을 시간 분 으로 나누기
        h += mm / 60;
        m += mm % 60;

        if (m >= 60){
            h += 1;
            m -= 60;
        }

        if (h >= 24){
            h -= 24;
        }

        System.out.println(h + " " + m);
    }
}
