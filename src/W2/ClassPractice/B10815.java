package W2.ClassPractice;

import java.io.*;
import java.util.Arrays;

// https://www.acmicpc.net/problem/10815
// 숫자카드
public class B10815 {
    public void solution() throws IOException {
        // 입력 받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String[] mycard = reader.readLine().split(" ");

        int[] mycardInt = new int[N];
        for (int i = 0; i <N; i++){
            mycardInt[i] = Integer.parseInt(mycard[i]);
        }

        Arrays.sort(mycardInt);

        int M= Integer.parseInt(reader.readLine());
        String[] incard = reader.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int result = binarySearch(mycardInt,Integer.parseInt(incard[i]))
                    ? 1:0;
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }

    // 이진 탐색
    public boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        // 왼쪽 인덱스가 오른쪽보다 커지면 발견 x
        while(left <= right){
            int mid = (right -left)/2 + left;

            if (arr[mid] == target) return true;
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        new B10815().solution();
    }
}
