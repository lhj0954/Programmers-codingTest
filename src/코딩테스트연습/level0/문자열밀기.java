package 코딩테스트연습.level0;

public class 문자열밀기 {
    public int solution(String A, String B) {
        int answer = -1;
        StringBuilder a = new StringBuilder(A);
        for(int i = 0; i < a.length(); i++) {
            if(a.toString().equals(B)) {
                answer = i;
            }
            a.insert(0, a.charAt(a.length() - 1));
            a.deleteCharAt(a.length() - 1);
        }
        return answer;
    }
}
