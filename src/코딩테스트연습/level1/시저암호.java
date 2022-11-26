package 코딩테스트연습.level1;

public class 시저암호 {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 91 && arr[i] != ' ') {
                if((arr[i] + n) < 91) {
                    arr[i] +=  n;
                } else {
                    arr[i] = (char) (((arr[i] + n) % 90) + 64);
                }
            }

            if(arr[i] > 96) {
                if((arr[i] + n) < 123) {
                    arr[i] += n;
                } else {
                    arr[i] = (char) (((arr[i] + n) % 122) + 96);
                }
            }
        }

        return new String(arr);
    }
}
