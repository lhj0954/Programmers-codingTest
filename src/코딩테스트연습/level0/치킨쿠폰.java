package 코딩테스트연습.level0;

public class 치킨쿠폰 {
    public int solution(int chicken) {
        int coupons = (chicken / 10) + (chicken % 10);
        int answer = chicken / 10;

        for(; coupons > 9;) {
            answer += coupons / 10;
            coupons = (coupons / 10) + (coupons % 10);
        }

        return answer;
    }
}
