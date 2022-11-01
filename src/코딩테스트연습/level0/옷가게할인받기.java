package 코딩테스트연습.level0;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = 0;
        if(price >= 500000) {
            answer = price*8/10;
        } else if(price >= 300000) {
            answer = price*9/10;
        } else if(price >= 100000){
            answer = price*95/100;
        } else {
            answer = price;
        }
        return answer;
    }
}
