package controller.menu.garden.view;

import user.Player;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {

    private int[][] garden;

    private final String GARDEN_WELCOME_MESSAGE = "정원에 오신 걸 환영합니다.";
    private final String GARDEN_FIRST_MENU = "1. 나의 정원 보기";
    private final String GARDEN_SECOND_MENU = "2. 열매 심기";
    private final String BACK_MENU = "0. 돌아가기\n";

    public void showGardenMenu() {
        print(GARDEN_WELCOME_MESSAGE);
        print(GARDEN_FIRST_MENU);
        print(GARDEN_SECOND_MENU);
        print(BACK_MENU);
    }

    public void showMyGarden() {

        // 플레이어의 정원 가져오기
        String[][] gardenArr = Player.getInstance().getGarden().getMap();

        // 정원 배열 출력
        for (int i = 0; i < gardenArr.length; i++) {
            String[] inGardenArr = gardenArr[i];
            showInGardenArr(inGardenArr);
        }
    }

    private void showInGardenArr(String[] inGardenArr) {
        for (int j = 0; j < inGardenArr.length; j++) {
            System.out.print(inGardenArr[j] + "\t");
        }
        System.out.println();
    }


    private void print(String message) {
        System.out.println(message);
    }
}