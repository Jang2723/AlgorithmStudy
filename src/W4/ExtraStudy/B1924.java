package W4.ExtraStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1924
// 2007년 - 브론즈1(수학)
public class B1924 {
    public static void main(String[] args) throws IOException {
        // 오늘은 2007년 1월 1일 월요일
        // 2007년 x월 y일은 무슨 요일일까?
        // 첫줄에 빈칸을 두고 x y
        // 1,3,5,7,8,10,12 -> 31일가지
        // 4,6,9,11 -> 30일까지
        // 2 -> 28일까지
        // SUN, MON, TUE, WED, THU, FRI, SAT 중 하나를 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]); // 월
        int y = Integer.parseInt(str[1]); // 일

        int Allday = 0;

        for (int i = 1; i < x; i++) {
            // 1월의 일 수부터 더해줌
            if (i== 1 || i == 3 || i == 5 || i == 7 || i== 8 || i == 10 || i == 12){
                Allday += 31;
            } else if ( i == 2) {
                Allday += 28;
            }else{
                Allday += 30;
            }
        }
        Allday += y;
        Allday %= 7;
        switch(Allday){
            case 1 :
                System.out.println("MON");
                break;
            case 2 :
                System.out.println("TUE");
                break;
            case 3 :
                System.out.println("WED");
                break;
            case 4 :
                System.out.println("THU");
                break;
            case 5 :
                System.out.println("FRI");
                break;
            case 6 :
                System.out.println("SAT");
                break;
            case 0 :
                System.out.println("SUN");
                break;
        }

    }
}
