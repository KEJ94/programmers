package level2;

public class 이진변환반복하기 {

    public static void main(String[] args) {
        int[] result = solution("110010101001");
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] solution(String s){
        int zeroCount = 0;
        int zeroLength = 0;
        while (!s.equals("1")) {
            zeroLength += s.length() - s.replaceAll("0", "").length();
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());

            zeroCount++;
        }
        return new int[]{zeroCount, zeroLength};
    }
}
