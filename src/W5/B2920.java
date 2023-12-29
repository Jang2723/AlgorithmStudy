package W5;
// https://www.acmicpc.net/problem/2920
// 음계-브2
/*
다장조는 c d e f g a b C 8개음
        1 2 3 4 5 6 7 8 로 바꿀 수 있다
ascending -> 1~8로 연주
descending -> 8~1로 연주
연주한 순서가 주어졌을 때 ascending, descending, mixed인지 판별
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] piano = br.readLine().split(" ");
        int[] input= new int[8];
        for (int i = 0; i <8 ; i++) {
            input[i] = Integer.parseInt(piano[i]);
        }
        String str="";
        int cnt = input[0];
        // input의 시작이 1이고 1씩 증가하면 ascending
        if (input[0] == 1){
            for (int i = 0; i < 8; i++) {
                if (input[i] == cnt ){
                    str = "ascending";
                }
                else{
                    str = "mixed";
                    break;
                }
                cnt++;
            }
        }
        // input의 시작이 8이고 1씩 감소하면 descending
        else if (input[0] == 8) {
            for (int i = 0; i < 8; i++) {
                if (input[i] == cnt) {
                    str = "descending";
                } else {
                    str = "mixed";
                    break;
                }
                cnt--;
            }
        }
        // 그 외의 것은 전부 mixed
        else{
            str = "mixed";
        }
        System.out.println(str);
    }
}
