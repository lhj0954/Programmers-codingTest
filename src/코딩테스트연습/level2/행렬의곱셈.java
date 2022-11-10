package 코딩테스트연습.level2;

public class 행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                int count = 0;
                for(int x = 0; x < arr1[0].length; x++){
                    count += (arr1[i][x] * arr2[x][j]);
                }
                answer[i][j] = count;
            }
        }
        return answer;
    }
}
//    int[][] answer = new int[arr1.length][arr1[0].length];
//
//        for(int i = 0; i < arr1.length; i++) {
//        for(int j = 0; j < arr1[i].length; j++) {
//        int sum = 0;
//
//        for(int k = 0; k < arr1[i].length; k++) {
//        sum += arr1[i][k] * arr2[k][j];
//        }
//
//        answer[i][j] = sum;
//        }
//        }
//
//        return answer;