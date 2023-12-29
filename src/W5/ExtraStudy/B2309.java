package W5.ExtraStudy;
// https://www.acmicpc.net/problem/2309
// 일곱 난쟁이 - 브1/브루트포스/정렬
/*
일곱 난쟁이의 키의 합이 100
아홉 난쟁이의 키가 주어졌을 때, 일곱난쟁이를 찾아라/ 오름차순 출력
9명의 키의 합에서 2명의 키를 뻈을 때 100이면 출력
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[9]; // 들어온 난쟁이 9명
        int sum = 0;
        // 9명의 키 입력
        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - height[i] - height[j] == 100){
                    // 앞에서부터 2명씩 순서대로 뻈을 때 100이 되는 경우
                    height[i] = 0;
                    height[j] = 0;
                    Arrays.sort(height);
                    for (int k = 2; k <9 ; k++) { // 앞에 0 2개 빼고 출력
                        System.out.println(height[k]);
                    }
                    return;
                }
            }
        }
    }
}
