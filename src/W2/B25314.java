package W2;
// 4바이트는 long int, 12바이트는 long long long int라고 생각할 떄
// n바이트는 어떤 출력형태를 갖는가?
// https://www.acmicpc.net/problem/25314
import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // long 몇번 출력해야 하는지 count 하기
        int count = n / 4;
        for(int i=0; i< count; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
