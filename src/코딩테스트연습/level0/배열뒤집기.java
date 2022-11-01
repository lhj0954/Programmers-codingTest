package 코딩테스트연습.level0;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        for(int i = 0; i < num_list.length/2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length - 1 - i];
            num_list[num_list.length - 1 - i] = temp;
        }
        return num_list;
    }
}
