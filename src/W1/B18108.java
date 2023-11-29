package W1;

import java.util.Scanner;
/* 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.*/
public class B18108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        System.out.println(year - 543);
    }
}
