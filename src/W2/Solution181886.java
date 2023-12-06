package W2;
// https://school.programmers.co.kr/learn/courses/30/lessons/181886
/*최대 5명씩 탑승가능한 놀이기구를 타기 위해
줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은
리스트를 return하도록 solution 함수를 완성해주세요.
마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Solution181886 {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();

        for(int i =0; i<names.length; i++){
            if ( i == 0 || i % 5 ==0)
                list.add(names[i]);
        }
        // list를 배열로 만들어 주는 방법
        // list.toArray(new 배열의 타입[(리스트이름.size()])
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }

    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        // new Solution181886().solution(names) 그냥 출력하게 되면 객체 타입과 해시값이 출력된다.
        // 출력 결과 예시가 배열로 출력하는 것이기 떄문에 배열로 만들어 주는 Arrays.toString() 사용
        // Arrays.toString 은 모든 배열 요소를 ,로 구분하고 문자열의 맨앞과 뒤에 [ ] 가 붙는다.
        System.out.println(Arrays.toString(new Solution181886().solution(names)));
    }
}
