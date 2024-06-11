package kosa.game;

import java.util.Arrays;

public class BaseBall {
    // 난수를 생성(중복x)
    private int hidden[];

    public BaseBall () {
        hidden = new int[3];
        hidden[0] = (int)(Math.random() * 9) + 1;  // 1 ~ 9까지
        // 중복을 피하기
        do {
            hidden[1] = (int)(Math.random() * 9) + 1;
        } while (hidden[1] == hidden[0]);
        do {
            hidden[1] = (int)(Math.random() * 9) + 1;
        } while (hidden[0] == hidden[2] || hidden[1] == hidden[2]);

        System.out.println("정답 : " + Arrays.toString(hidden));
    }

    // 스트라이크 체크
    //123
    //142
    public int countStrike(int[] input) {
        int strike = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == hidden[0]) {
                strike++;
            }
        }
        return strike;
    }

    // 볼 체크
    public int countBall(int[] input) {
        int ball = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == hidden[(i+1)%3]) ball++;
            if (input[i] == hidden[(i+2)%3]) ball++;
        }
        return ball;
    }

}
