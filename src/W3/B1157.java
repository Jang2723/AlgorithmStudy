package W3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1157
// 단어 공부
public class B1157 {
    public static void main(String[] args) throws IOException {
        // 앛파벳 단어가 주어지면 가장 많이 사용된 알파벳 알아내기 / 대소문자 구분 x
        // 여러개일 경우 ? 출력 // 대문자로 출력
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] alpha = new int[26]; // 알파벳 카운트

        //'a' 97  A 65
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 97){
                // 대문자
                alpha[str.charAt(i)-65]++;
            }
            else{
                // 소문자
                alpha[str.charAt(i)-97]++;
            }
        }
        // 사용된 알파벳의 갯수가 같은 경우도 고려
        int max = 0;
        int max_index=0;
        int cnt=0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] > max){
                max = alpha[i];
                max_index=i;
            }
        }
        for (int i = 0; i < alpha.length; i++) {
            if (max == alpha[i]) cnt++;
        }
        
        if (cnt >=2){
            System.out.println("?");
        }
        else{ // 알파벳 대문자로 출력
            System.out.println((char)(max_index+65));
        }
        
    }
}
