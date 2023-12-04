package W2;
/* 접두사인지 확인하기
어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
예를 들어, "banana"의 모든 접두사는
"b", "ba", "ban", "bana", "banan", "banana"입니다.
문자열 my_string과 is_prefix가 주어질 때,
is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
*/
public class Solution181906 {
    public int solution(String my_string, String is_prefix) {
        /*
        startsWith()
        대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수
        boolean에 맞춰 true/false 값을 리턴
        공백도 취급한다

        public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }
        return answer;
    }
        */
        int answer = 0;
        // 모든 접두사가 있는 배열 만들기
        int k =1;
        String[] arr = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.substring(0,k);
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //"banana"	"ban"	1
        //"banana"	"nan"	0
        //"banana"	"abcd"	0
        //"banana"	"bananan"	0
        String my_string = "banana";
        String is_prefix = "ban";
        System.out.println(new Solution181906().solution(my_string,is_prefix));
    }
}
