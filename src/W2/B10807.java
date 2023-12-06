package W2;
// https://www.acmicpc.net/problem/10807
import java.util.Scanner;

// 총 n개의 정수가 주여졌을 때, 정수 v가 몇개인지 구하는 프로그램을 작성
// 첫쨰 줄 입력될 정수의 총 수, 둘쨰 줄 정수들, 셋쨰 줄 찾아야 할 정수 v
public class B10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt(); // 찾아야 할 정수
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}
