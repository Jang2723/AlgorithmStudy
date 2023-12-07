package W2.ClassPractice;
//  https://www.acmicpc.net/problem/3986
// 좋은 단어
/*
모든 글자가 A와 B로 바뀌었다.
A,A B,B끼리 아치형 곡선을 그어 쌍을 짓기로 함
선끼리 교차하지 않으면서 -> ABA 또는 BAB로 들어오면 좋지 않은 단어
각 글자를 정확히 한개의 다른 위치에 있는 글자와 짝 지을 수 있다면 좋은 단어
스택 이용
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int good = 0;

        for (int i = 0; i < n; i++) {
            // 단어 입력받기
            String word = br.readLine();
            Stack<Character> ab = new Stack<>();
            // 단어가 짝 맞는지 스택으로 확인
            for (char c : word.toCharArray()) {
                // 스택이 비어있거나 제일 위의 글자가 현재 글자와 다르면 push
                if (ab.isEmpty() || ab.peek() != c){
                    ab.push(c);
                }
                // 제일 위의 글자가 현재 글자와 같으면 pop
                else if (ab.peek() == c) {
                    ab.pop();
                }

            }// 글자를 다 확인하고 스택이 비어있으면 좋은 단어
            if (ab.empty()) good++;
        }
        System.out.println(good);
    }
}
