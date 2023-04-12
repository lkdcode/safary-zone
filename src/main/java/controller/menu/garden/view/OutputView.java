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
    private final String RASP_BERRY = "1. 라즈베리 심기";
    private final String BLUE_BERRY = "2. 블루베리 심기";
    private final String BLACK_BERRY = "3. 블랙베리 심기";

    public void showGardenMenu() {
        print(GARDEN_WELCOME_MESSAGE);
        print(GARDEN_FIRST_MENU);
        print(GARDEN_SECOND_MENU);
        print(BACK_MENU);
    }

    public void showMyGarden() {

        // 플레이어의 정원 가져오기
        String[][] gardenMap = Player.getInstance().getGarden().getMap();

        // 정원 배열 출력
        print("1\t2\t3\t4\t5");
        for (int i = 0; i < gardenMap.length; i++) {
            String[] inGardenMap = gardenMap[i];
            for (int j = 0; j < inGardenMap.length; j++) {
                System.out.print(inGardenMap[j] + "\t");
            }
            System.out.println(i+1);
        }
    }

    public void showPlantingMenu() {
        print(RASP_BERRY);
        print(BLUE_BERRY);
        print(BLACK_BERRY);
        print(BACK_MENU);
    }

    public void rowAndColumn(String location) {
        System.out.print(location + " 위치 : ");
    }



    private void print(String message) {
        System.out.println(message);
    }
}