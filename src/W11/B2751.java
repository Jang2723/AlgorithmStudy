package W11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/2751
// 수 정렬하기 2 - 정렬 - 실5
public class B2751 {
    public static void main(String[] args) throws IOException {
        // 첫째줄에 수의 개수 n
        // 둘째줄부터 n개의 줄에 수가 주어짐,1 <= n <= 1000000보다 작거나 같은 정수, 중복 x
        // 첫째줄부터 n개의 줄에 오름차순으로 정렬한 것을 한줄에 하나씩 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

//        Arrays.sort(nums); // 시간 초과
        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
