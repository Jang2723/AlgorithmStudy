package W4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/1316
// 그룹 단어 체커 - 심화1
public class B1316 {
    public static void main(String[] args) throws IOException {
        // 그룹 단어 - 단어에 존재하는 모든 문자에 대해서 각 문자가 연속으로 나타나는 경우
        // ccazzzzzbb -> c a z b 가 연속
        // kin -> k i n 이 연속
        // aabbbccb는 a b c b 로 b가 떨어져서 나타나기 때문에 그룹단어 x
        // 단어 n개를 입력받아 그룹단어의 개수 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int groupword = n; // 처음 그룹단어를 입력받은 n으로 두고 그룹단어가 아닐때마다 -1
        //n개만큼 입력받기
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean[] test = new boolean[26]; // false초기화

            for (int j = 0; j < str.length() -1; j++) {
                if (str.charAt(j) != str.charAt(j+1)){
                    // 현재 알파벳과 다음 알파벳이 다른 경우
                    if (test[str.charAt(j+1) - 97]){// 이미 한번 체크된 단어일 경우
                        groupword--;
                        break; //그룹단어가 아니면 이번 반복문 종료
                    }
                }
                test[str.charAt(j)-97] = true; //이번에 검사한 현재 알파벳을 있다고 표시
            }
        }
        System.out.println(groupword);

    }
}
