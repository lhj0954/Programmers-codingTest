package 코딩테스트연습.level1;

public class 콜라문제 {
    public int solution(int a, int b, int n) {
        int empty = n;
        int get = 0;

        while(empty >= a) {
            get += (empty / a) * b;
            empty = ((empty / a) * b) + (empty % a);
        }

        return get;
    }
}
