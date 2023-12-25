package W5.ExtraStudy;

// https://www.acmicpc.net/problem/1032
// 명령 프롬프트 - 수학-브1
// 검색 결과가 주어졌을 때 패턴으로 뭘 처야 그 결과가 나오는지를 출력
// 패턴에는 알파벡, . , ? 만 넣을 수 있다.
// 가능하면 ?는 적게 사용, 파일 이름의 길이는 모두 같다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        // 파일 이름 저장
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        boolean diff;
        for (int i=0; i<str[0].length(); i++){
            diff = false;
            for (int j=0; j<n-1; j++){
                // 모든 파일의 같은 인덱스의 글자만 비교
                if (str[j].charAt(i)!=str[j+1].charAt(i)){
                    // 비교하려는 글지가 같지 않으면 true
                    diff = true;
                    break;
                }
            }
            if (diff) // 같지 않아서 true이기 때문에 ?출력
                System.out.print("?");
            else
                System.out.print(str[0].charAt(i));
        }
    }
}

/*
StringBuilder sb = new StringBuilder();
// sb에 str[0]저장하고 str[1]부터 다른 부분만 ?로 교체
sb.append(str[0]);
for (int i = 1; i < n; i++) {
    for (int j = 0; j < str[0].length(); j++) {
        if (sb.charAt(j) != str[i].charAt(j)){
            sb.deleteCharAt(j);
            sb.insert(j,"?");
        }
    }
}
if (n == 1){ // n이 1이면 입력된 파일명 출력
    System.out.println(str[0]);
} else if (str[0].length() == 1) { // 파일명의 길이가 1이면 ? 출력
    System.out.println("?");
} else{ // 파일이1개도 아니고 파일명의 길이가 1도 아니면 sb 출력
    System.out.println(sb);
}
 처음에는 sb에서 다르 부분이 있으면 그부분만 ?로 교체했는데 98프로에서 계속 실패
-> 반례가 있는 것 같은데 못 찾겠음
*/
