package 코딩테스트연습.level1;

public class 제일작은수제거하기 {
    public static int[] solution(int[] arr) {
        int[] answer = arr.clone();

        for (int i = 0; i < answer.length; i++) {
            for (int k = i; k < answer.length; k++) {
                if (answer[i] < answer[k]) {
                    int temp = answer[i];
                    answer[i] = answer[k];
                    answer[k] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 23, 7, 15};

        //solution();
    }
}
