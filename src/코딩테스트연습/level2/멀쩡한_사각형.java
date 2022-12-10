package 코딩테스트연습.level2;

public class 멀쩡한_사각형 {
    public static long Euclid (int b, int s) {
        if(b % s == 0) {
            return (long)s;
        }
        return Euclid(s, b % s);
    }
    public long solution(int w, int h) {
        long answer = 1;

        if(w > h) {
            int temp = w;
            w = h;
            h = temp;
        }

        long rate = Euclid(w, h);
        long w_rate = w / rate;
        long h_rate = h / rate;

        answer = ((long)w * (long)h) - ((w_rate + h_rate) - 1) * rate;

        return answer;
    }
}
