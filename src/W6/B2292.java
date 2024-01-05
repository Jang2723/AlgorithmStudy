package W6;

// https://www.acmicpc.net/problem/2292
// 벌집 -일반수학-브2
 /*
        육각형으로 이루어진 벌집
        중앙의 방부터 시작해 이웃하는 방에 돌아가면서
        1씩 증가하는 번호를 주소로 매김
        숫자 n이 주어졌을 때, 벌집의 중앙 1에서 n번방까지
        최소 개수의 방을 지나서 갈때 볓개의 방을 지나가는지 계산
        ex) 13까지는 3, 58까지는 5
        1 - 6 - 12 - 18
총 방수  1   7   19...
        시작i를 1이라고 가정
        i= 1일때  방의 갯수  (i) * 6의 배수
        n까지 최소 가야하는 방의 개수
        */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum=1; // 중앙 1시작, 처음 방의 개수
        int cnt=1; // 방 건너는 카운트
        while(n>sum){
            // 총 방의 개수가 n보다 작을 동안만 계산
            // 이웃하는 방을 한바퀴 돌고 다음 건너줄 방에 들어갈때 cnt 증가
            sum += cnt * 6;
            cnt++;
        }
        System.out.println(cnt);
    }
}
