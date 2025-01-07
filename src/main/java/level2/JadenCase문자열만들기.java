package level2;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        System.out.println("|"+ solution("for     the last week   ") + "|");
    }

    public static String solution(String s){
        StringBuilder answer = new StringBuilder();
        String[] strArray = s.split(" ");
        // 마지막 공백 여부를 체크할 변수
        boolean endsWithSpace = s.endsWith(" ");
        for (int i = 0; i < strArray.length; i++) {
            String str = strArray[i];
            if (!str.isEmpty()) {
                // 첫 글자만 대문자로, 나머지는 소문자로
                str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
                answer.append(str);
            }
            // 공백을 추가
            if (i < strArray.length - 1 || endsWithSpace) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
