package kosa.game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 게임 진행 여부
        boolean start = true;

        // 난수 생성
        Random random = new Random();
        int[] answer = radom(random);

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 게임 반복
        while (start) {
            // 사용자 입력
            System.out.print("3개의 숫자를 입력하세요: ");
            int[] userGuess = new int[3];
            for (int i = 0; i < userGuess.length; i++) {
                userGuess[i] = scanner.nextInt();
            }

            // 스트라이크와 볼 계산
            baseball result = check(answer, userGuess);

            // 결과 출력
            result.print();

            // 게임 종료 조건 체크
            if (result.getStrike() == 3) {
                System.out.println("정답입니다! 축하합니다!");
                start = false;
            }
        }

        // Scanner 객체 닫기
        scanner.close();
    }

    // 난수 생성 메서드
    private static int[] radom(Random random) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(9) + 1;
            } while (isDuplicate(numbers, randomNumber, i));

            numbers[i] = randomNumber;
        }

        return numbers;
    }

    // 중복 체크 메서드
    private static boolean isDuplicate(int[] numbers, int randomNumber, int index) {
        for (int i = 0; i < index; i++) {
            if (numbers[i] == randomNumber) {
                return true;
            }
        }

        return false;
    }

    // 스트라이크와 볼 계산 메서드
    private static baseball check(int[] answer, int[] userGuess) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == userGuess[i]) {
                strike++;
            } else if (contains(answer, userGuess[i])) {
                ball++;
            }
        }

        return new baseball(strike, ball);
    }

    // 배열에 특정 값이 포함되어 있는지 확인하는 메서드
    private static boolean contains(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }

        return false;
    }
}
