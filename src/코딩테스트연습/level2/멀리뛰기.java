package 코딩테스트연습.level2;

public class 멀리뛰기 {
    public long solution(int n) {
        if(n < 2) {
            return 1;
        }

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] % 1234567 + arr[i - 2] % 1234567;
        }

        return arr[arr.length - 1] % 1234567;
    }
}
