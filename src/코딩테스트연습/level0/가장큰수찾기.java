package 코딩테스트연습.level0;

public class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int temp = 0;
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > temp) {
                temp = array[i];
                index = i;
            }
        }

        return new int[]{temp, index};
    }
}
