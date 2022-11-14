package 코딩테스트연습.level2;

public class 타겟넘버 {
    public static int answer = 0;
    public static void dfs(int index, int[] arr, int t, int sum) {
        if(index == arr.length) {
            if(sum == t) {
                answer++;
            }
            return;
        }
        dfs(index + 1, arr, t, sum + arr[index]);
        dfs(index + 1, arr, t, sum - arr[index]);
    }

    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);

        return answer;
    }
}
