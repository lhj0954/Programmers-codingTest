package 코딩테스트연습.level0;

public class 배열회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        if(direction.equals("right")) {
            int temp = numbers[numbers.length - 1];
            for(int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;
        } else if(direction.equals("left")) {
            int temp = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
        }

        return numbers;
    }
}
