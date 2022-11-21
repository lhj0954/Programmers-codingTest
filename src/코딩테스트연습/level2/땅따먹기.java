package 코딩테스트연습.level2;

public class 땅따먹기 {
    public int solution(int[][] land) {
        for(int i = 1; i < land.length;i++){
            land[i][0] += Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0],Math.max(land[i-1][2],land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][2]));
        }

        return Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), Math.max(land[land.length-1][2],land[land.length-1][3]));
    }
}
//2번째 열부터 이번 값에서 가장 큰 값을 더해나가면 된다. -> 문제를 거꾸로 생각해봄