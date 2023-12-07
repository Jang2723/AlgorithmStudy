package W2.ClassPractice;
//https://www.acmicpc.net/problem/10988
import java.util.Scanner;

// 알파벳 소문자로만 이루어진 단어가 주어진다.
// 이때 단어가 팰린드롬인지 아닌지 확인해라
// 팰린드롬 : 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어
public class B10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자열 입력받기
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() -1; i >=0 ; i--){
            sb.append(str.charAt(i));
        }

        String s = sb.toString();
        int result = 1;
        if(!str.equals(s)) result =0;
        System.out.println(result);
    }
}
