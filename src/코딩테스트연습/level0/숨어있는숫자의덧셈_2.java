package 코딩테스트연습.level0;

public class 숨어있는숫자의덧셈_2 {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", " ");
        str = str.strip();

        if (str.length() == 0) {
            return 0;
        } else {
            str = str.replaceAll("\\s+", " ");

            String[] elements = str.split(" ");

            for (int i = 0; i < elements.length; i++) {
                answer += Integer.parseInt(elements[i]);
            }

            return answer;
        }
    }
}
