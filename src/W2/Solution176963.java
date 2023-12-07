package W2;
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
// 추억 점수
public class Solution176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // name 그리워하는 사람들의 이름
        // year 그리움 점수
        // 사진에 있는 사람들 이름
        // -> 사진에 있는 사람들 이름 중 name을 검색해서 있으면 name의 인덱스와 같은 year의 값 추가
        int sum =0;
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if(photo[i][j].equals(name[k])){
                        //일치하는 이름이 있다면
                        sum += yearning[k]; // 일치하는 이름의 인덱스와 같은 year의 값 추가
                    }
                }
            }
            answer[i] = sum;
            sum = 0; //초기화
        }
        return answer;
    }
}
