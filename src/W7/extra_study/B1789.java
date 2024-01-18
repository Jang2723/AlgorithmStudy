package W7.extra_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1789
// 수들의 합
public class B1789 {
    public static void main(String[] args) throws IOException {
        /*
        서로다른 n개의 자연수의 합이 s
        첫쟤줄에 s의 값이 주어질따
        n의 최댓값은?
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        //빼줄 값
        int N = 1;
        while(true) {
            if(S >= N) S -= N;
                //S보다 N이 작다면 반복을 종료해준다.
            else break;
            N++;
        }
        //--N을 해주는 이유는 N와 --는 순서상에 문제가 생기기에 N--를 하면 N을 출력하고 --를 한다.
        //그렇기에 빼주고 출력하기 위해 --를 앞에 두자.
        System.out.println(--N);
    }
}
