package W4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/25206
// 너의 평점은
public class B25206 {
    public static void main(String[] args) throws IOException {
        // 전공 평점이 3.3 이상, 졸업고사 통과 -> 졸업 가능
        // 전공평점 계산해주는 프로그램
        // 학점이 P인 과목은 계산 제외
        // 20줄에 걸쳐 수강한 과목의 이름, 학점, 등급이 공백으로 주어진다.
        //A+	4.5
        //A0	4.0
        //B+	3.5
        //B0	3.0
        //C+	2.5
        //C0	2.0
        //D+	1.5
        //D0	1.0
        //F	    0.0
        // 학점 계산 방법 학점 * 듭급의 점수 의 합 / 과목 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] major = new String[20][20];
        // 성적을 학점과 등급만 저장
        for (int i = 0; i < 20; i++) {
            String[] str = br.readLine().split(" ");
            major[i][0] = str[1];
            major[i][1] = str[2];
        }
        double sum = 0.0;
        double gradeSum = 0; //학점의 총합
        for (int i = 0; i < 20; i++) {
            switch(major[i][1]) { // 학점이 뭔지 검사
                case "A+":
                    sum += Double.parseDouble(major[i][0]) * 4.5;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "A0":
                    sum += Double.parseDouble(major[i][0]) * 4.0;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "B+":
                    sum += Double.parseDouble(major[i][0]) * 3.5;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "B0":
                    sum += Double.parseDouble(major[i][0]) * 3.0;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "C+":
                    sum += Double.parseDouble(major[i][0]) * 2.5;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "C0":
                    sum += Double.parseDouble(major[i][0]) * 2.0;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "D+":
                    sum += Double.parseDouble(major[i][0]) * 1.5;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "D0":
                    sum += Double.parseDouble(major[i][0]) * 1.0;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "F":
                    sum += Double.parseDouble(major[i][0]) * 0.0;
                    gradeSum += Double.parseDouble(major[i][0]);
                    break;
                case "P":
                    break;
            }
        }
        if (gradeSum == 0.0){
            System.out.println("0.0");
        }
        else{
            System.out.printf("%.6f",sum/gradeSum);
        }
    }
}
