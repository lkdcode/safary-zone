package common;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * 공용으로 사용되는 클래스 중 하나
 * getRandom() : 난수 리턴
 */
public class MakeCommon {
    /**
     * 난수를 생성합니다.
     * Math.random() 은 의사 난수 생성이라 완벽한 난수를 생성한다고 보기 어렵습니다.
     * 해당 클래스를 이용해 minRange 이상 ~ maxRange 이하의 범위에 해당하는 난수를 double 타입으로 리턴 받습니다.
     *
     * @param minRange : 이상
     * @param maxRange : 이하
     * @return
     */
    public static double getRandom(int minRange, int maxRange) {
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            return (instanceStrong.nextDouble() * maxRange) + minRange;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return (Math.random() * maxRange) + minRange;
    }

    /**
     * 메세지와 시간을 매개변수로 입력받아서 도트형식으로 콘솔에 출력하는 메서드
     *
     * @param message : 출력할 메시지
     * @param millis  : 1 = 1/1000 초
     */
    public static void dottedPrint(String message, int millis) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            try {
                sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void stopLine() {
        String message = "\n\n ↪ 계속 하려면 엔터를 누르세요...\n\n";
        dottedPrint(message, 30);
        new Scanner(System.in).nextLine();
    }
}