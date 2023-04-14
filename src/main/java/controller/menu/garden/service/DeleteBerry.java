package controller.menu.garden.service;

import user.Player;

/**
 * 열매를 심은 뒤, 포획을 5번 진행하면 해당 열매를 삭제하는 클래스
 */
public class DeleteBerry {
    private final int CAPTURE_FINISH = 5;

    public DeleteBerry() {
    }

    /**
     * 포획을 시도할 때마다 실행됩니다.
     * countMap 내부를 반복문으로 돌면서
     * 배열 요소의 값이 0이 아닌 경우 값을 -1 해줍니다.
     * 값이 0인 경우, 동일한 위치의 map 배열 요소를 🌱 으로 바꿉니다.
     */
    public void deleteBerry() {
        // map, countMap 배열 복사본 생성
        String[][] copyMap = Player.getInstance().getGarden().getMap();
        int[][] copyCountMap = Player.getInstance().getGarden().getCountMap();
        for (int i = 0; i < copyCountMap.length; i++) {
            for (int j = 0; j < copyCountMap.length; j++) {
                if (copyCountMap[i][j] != 0) copyCountMap[i][j] -= 1;
                if (copyCountMap[i][j] == 0) copyMap[i][j] = "🌱";
            }
        }
        Player.getInstance().getGarden().setCountMap(copyCountMap);
        Player.getInstance().getGarden().setMap(copyMap);
    }
}
