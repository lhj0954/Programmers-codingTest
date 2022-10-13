package 코딩테스트연습.level1;

public class 이상한문자만들기 {
    public static String solution(String s) {
        s = s.strip();
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ");

        System.out.println(arr[1]);

        for(int j = 0; j < arr.length; j++) {
            String str = arr[j];
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {

                String temp;
                if ((i % 2) == 0) {
                    temp = str.substring(i, i + 1).toUpperCase();
                } else {
                    temp = str.substring(i, i + 1).toLowerCase();
                }

                word.append(temp);
            }

            answer.append(word).append(" ");
        }

        return answer.toString().strip();
    }

    public static void main(String[] args) {
        solution("try hello world");
        //System.out.println(solution("try hello world"));
    }
}
