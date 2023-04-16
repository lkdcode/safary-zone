package safaryzone.controller.menu.capture.view;

import safaryzone.common.MakeCommon;
import safaryzone.user.item.ball.MonsterBall;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {
    private final int MILLIS = 15;

    public void menu() {
        String message = "포획을 할 준비를 합니다. 🤔\n\n";
        message += "👉 매뉴 번호를 입력해주세요\n";
        message += "1️⃣ 몬스터볼 던지기\n";
        message += "2️⃣ 다가가기\n";
        message += "0️⃣ 종료하기\n";

        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void ready(String wildPokemonName) {
        String message = "\n\n🕑 잠시 후 야생의 포켓몬이 등장합니다.\n"
                + ".......🕝...\n"
                + "..🕢...\n"
                + "..........🕥......\n"
                + "‼️‼️‼️‼️\n"
                + "\n야생의 [" + wildPokemonName + "] 이(가) 등장하였습니다. ❕ 🐾🐾🐾\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }

    public void showBallList(String myBallList) {
        String message = "\n\n🖲 몬스터 볼을 선택해주세요 🖲️\n"
                + "➖➖➖➖ 나의 몬스터 볼 리스트 ➖➖➖➖\n\n"
                + myBallList
                + "\n➖➖➖➖ ➖➖➖➖➖➖ ➖➖➖➖\n\n"
                + "🔴 몬스터 볼의 이름을 입력해주세요 : \n\n";
        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void notEnoughQuantity(MonsterBall ball) {
        String message = "\n\n선택한  [" + ball + "] 의 수량이 부족합니다 ‼️\n"
                + "다시 매뉴로 돌아갑니다.! 🔙";

        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void throwBall(String wildPokemonName, MonsterBall ball) {
        String message = "\n[" + wildPokemonName + "] 에게 " + "[" + ball + " 볼] 을 던졌습니다 !! 🥏\n";
        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void successCapture(String wildPokemonName, boolean already) {
        String message = "\n\n........효과는 굉장했다!! 🎉🎉\n";
        message += "🎊 야생의 [" + wildPokemonName + "] 을(를) 포획하였습니다.!!! 🎊\n";

        if (already) {
            message += "하지만 이미 보유하고 있어서 포켓몬도감에 새로 추가되지 않았습니다.. 😅\n";
            message += "(괜히 기분만 좋아졌다..!🤔) \n\n";
        } else {
            message += "😆 내 포켓몬리스트에 추가되었습니다.!! 👍👍\n\n";
        }


        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void failCapture() {
        String message = "\n.........\n"
                + ".......하지만 효과가 없었다..❕ 😤\n\n";
        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void goNear() {
        String message = "\n\n가까이 다가가기를 시도하겠습니다..... 🚶..🚶..‍🚶..\n"
                + "3️⃣ ...🚶.............\n"
                + "2️⃣ ........🚶........\n"
                + "1️⃣ .............🚶...\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void runAway(String wildPokemonName) {
        String message = " ..... 이런!!! 😮\n"
                + "야생의 [" + wildPokemonName + "] 이(가) 도망쳤습니다...❕ 😨💨💨\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void successGoNear() {
        String message = "\n\n👍 다가가기에 성공하였습니다. 😆\n"
                + ".... 효과는 대단했다 ‼️❕‼️❕‼️❕\n"
                + "😁 포획 확률이 [5 퍼센트] 상승하였습니다!! ❇️\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
    }

    public void exit() {
        String message = "\n\n종료하기를 선택하였습니다.\n"
                + "메인 메뉴로 돌아갑니다. 🔙\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
    }
}