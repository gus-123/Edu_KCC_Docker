package kosa.game;

public class baseball {
    // strike, ball
    private int strike;
    private int ball;
    
    // 디폴트 생성자
    public baseball() {
        
    }
    
    public baseball(int strike,int ball) {
        this.strike = strike;
        this.ball = ball;
    }
    
    // 출력 메서드
    public void print() {
        System.out.println(strike + "S" + ball + "B");
    }

    public int getStrike() {
        return strike;
    }
    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }
}
