package controller.menu.shop.view;

import user.Player;
import user.item.ball.MonsterBall;
import user.item.berry.Berry;

import static common.MakeCommon.*;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {
    private final String WELCOME_MESSAGE = "\n🏪 상점에 오신 걸 환영합니다.";
    private final String FIRST_MENU = "1️⃣ 🖲️ 몬스터볼 구매";
    private final String SECOND_MENU = "2️⃣ 🍓 열매 구매";
    private final String BACK_MENU = "0️⃣ 🔙 돌아가기";
    private final String BUY_MONSTER_BALL_MENU = "\n# 몬스터 볼 구매 매뉴\n";
    private final String FIRST_BALL = "1️⃣ 일반 몬스터 볼 - 1200머니 👉 [포획 확률 : 20%]";
    private final String SECOND_BALL = "2️⃣ 하이퍼 몬스터 볼 - 5000머니 👉 [포획 확률 : 35%]";
    private final String THIRD_BALL = "3️⃣ 마스터 몬스터 볼 - 7500머니 👉 [포획 확률 : 45%]";
    private final String BUY_BERRY_MENU = "\n# 열매 구매 매뉴\n";
    private final String FIRST_BERRY = "1️⃣ 🍇 블루 베리 - 1000머니 👉 [30% 확률로 좌,우로 열매를 뿌립니다.]";
    private final String SECOND_BERRY = "2️⃣ 🍓 라즈 베리 - 1200머니 👉 [20% 확률로 상,하로 열매를 뿌립니다.]";
    private final String THIRD_BERRY = "3️⃣ ♣️ 블랙 베리 - 1500머니 👉 [10% 확률로 상,하,좌,우로 열매를 뿌립니다.]";
    private final String INPUT_QUANTITY = "구매할 수량을 입력해주세요 👉 ";
    private final String BACK = "\n돌아갑니다.\n";
    private final String FAIL_BUY_MONSTER_BALL = "[❌ 몬스터 볼 구매에 실패하였습니다.]";
    private final String FAIL_BUY_BERRY = "[❌ 열매 구매에 실패하였습니다.]";
    private final String SUCCESSFUL_BUY_MONSTER_BALL = "\n[✅ 몬스터 볼 구매에 성공하였습니다.]";
    private final String SUCCESSFUL_BUY_BERRY = "\n[✅ 열매 구매에 성공하였습니다.]";
    private final String BOUGHT_QUANTITY = "구매한 수량 ▶️ ";
    private final String BOUGHT_MONSTER_BALL = "구매한 몬스터 볼 타입 👉 ";
    private final String BOUGHT_BERRY = "구매한 열매 종류 👉 ";
    private final String BALANCE_MONEY = "구매 후 남은 머니 💰 ";
    private final String NOW_MONEY = "현재 소지한 머니 💰 ";
    private final int MILLIS = 30;
    private final int SHORT_MILLIS = 10;

    public void showMenu() {
        String message = WELCOME_MESSAGE + System.lineSeparator()
                + NOW_MONEY + Player.getInstance().getInventory().getMoney() + System.lineSeparator()
                + FIRST_MENU + System.lineSeparator()
                + SECOND_MENU + System.lineSeparator()
                + BACK_MENU + System.lineSeparator();
        dottedPrint(message, MILLIS);
    }

    public void showMonsterBallMenu() {
        String message = BUY_MONSTER_BALL_MENU + System.lineSeparator()
                + FIRST_BALL + System.lineSeparator()
                + SECOND_BALL + System.lineSeparator()
                + THIRD_BALL + System.lineSeparator();
        dottedPrint(message, SHORT_MILLIS);
    }

    public void showBerryMenu() {
        String message = BUY_BERRY_MENU
                + FIRST_BERRY + System.lineSeparator()
                + SECOND_BERRY + System.lineSeparator()
                + THIRD_BERRY + System.lineSeparator();
        dottedPrint(message, SHORT_MILLIS);
    }

    public void failBuyMonsterBall() {
        dottedPrint(FAIL_BUY_MONSTER_BALL, MILLIS);
    }

    public void failBuyBerry() {
        dottedPrint(FAIL_BUY_BERRY, MILLIS);
    }


    public void successfulBuyMonsterBall(MonsterBall monsterBall, int quantity) {
        StringBuilder addMessage = new StringBuilder();
        addMessage.append(System.lineSeparator())
                .append(BOUGHT_MONSTER_BALL)
                .append(monsterBall.toString())
                .append(System.lineSeparator())
                .append(BOUGHT_QUANTITY)
                .append(quantity)
                .append(System.lineSeparator())
                .append(BALANCE_MONEY)
                .append(Player.getInstance().getInventory().getMoney())
                .append(System.lineSeparator()).append(System.lineSeparator());
        String message = SUCCESSFUL_BUY_MONSTER_BALL + addMessage;
        dottedPrint(message, MILLIS);
    }

    public void successfulBuyBerry(Berry berry, int quantity) {
        StringBuilder addMessage = new StringBuilder();
        addMessage.append(System.lineSeparator())
                .append(BOUGHT_BERRY)
                .append(berry.toString())
                .append(System.lineSeparator())
                .append(BOUGHT_QUANTITY)
                .append(quantity)
                .append(System.lineSeparator())
                .append(BALANCE_MONEY)
                .append(Player.getInstance().getInventory().getMoney())
                .append(System.lineSeparator()).append(System.lineSeparator());
        String message = SUCCESSFUL_BUY_BERRY + addMessage;
        dottedPrint(message, MILLIS);
    }

    public void inputQuantity() {
        dottedPrint(INPUT_QUANTITY, MILLIS);
    }

    public void exit() {
        dottedPrint(BACK, MILLIS);
    }

}