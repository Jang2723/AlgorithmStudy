package W2;
/*어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
예를 들어, "banana"의 모든 접미사는
"banana", "anana", "nana", "ana", "na", "a"입니다.
문자열 my_string과 is_suffix가 주어질 때,
is_suffix가 my_string의 접미사라면 1을,
아니면 0을 return 하는 solution 함수를 작성해 주세요.
 */
public class Solution181908 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        // 모든 접미사가 있는 배열 만들기
        int k =my_string.length();
        String[] arr = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.substring(i,k);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(is_suffix)) {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "wxyz";
        System.out.println(new Solution181908().solution(my_string,is_suffix));

    }
}
