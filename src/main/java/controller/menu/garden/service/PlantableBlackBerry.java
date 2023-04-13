package controller.menu.garden.service;

import user.Player;

/**
 * 열매를 심는 추상 메서드를 가지고 있는 GardenService를 implements 합니다.
 * 확률을 계산해주는 PlantingRate 를 extends 합니다.
 */
public class PlantableBlackBerry extends PlantingRate implements GardenService {
    /**
     * 블랙 베리는 심어진 위치로부터 상,하,좌,우를 추가적으로 심을 수 있습니다.
     * 그 확률을 계산할 때 필요한 BLACKBERRY_RATE 필드.
     * BLACKBERRY_ROW, COLUMN 은 상,하,좌,우를 계산하기 위한 배열입니다.
     * 만약에 map[3][1] 에 열매를 심었다고 가정한다면
     * map[4][1] , map[2][1], map[3][2], map[3][0] 위치에 추가적으로 심어질 수 있습니다.
     * 해당 값을 간단하게 계산하기 위해 배열로 선언해두고 반복문을 통해 계산합니다.
     * 반복문 ex)
     * map[3+1][1+0] ,map[3-1][1+0], map[3+0][1+1], map[3+0][1-1]
     */
    private final int[] BLACKBERRY_ROW = {1, -1, 0, 0};
    private final int[] BLACKBERRY_COLUMN = {0, 0, 1, -1};
    private final double BLACKBERRY_RATE = 10.0;
    private final String BLACK_BERRY = "♣️";
    private final int SIZE = 5;

    /**
     * row, column index 를 입력받아 열매를 심고
     * 보너스 심기 메서드를 호출합니다.
     *
     * @param row    : row Index
     * @param column : column Index
     */
    @Override
    public void plantingBerry(int row, int column) {
        Player.getInstance().getGarden().planting(BLACK_BERRY, row, column);
        bonusPlanting(row, column);
    }

    /**
     * 보너스 심기 당첨 시, 보너스 열매를 심습니다.
     *
     * @param row    : row Index
     * @param column : column Index
     */
    @Override
    public void plantingBonusBerry(int row, int column) {
        Player.getInstance().getGarden().planting(BLACK_BERRY, row, column);
    }

    /**
     * 위의 로직과 동일합니다.
     *
     * @param row    : 심어진 기존 위치
     * @param column : 심어진 기존 위치
     */
    private void bonusPlanting(int row, int column) {
        // 반복문(4번)을 돌면서
        // 일정 확률로 심어집니다.
        for (int i = 0; i < BLACKBERRY_COLUMN.length; i++) {
            // +1 , +(-1) , +0 으로 인덱스 위치를 다시 계산합니다.
            int rowIndex = row + BLACKBERRY_ROW[i];
            int columnIndex = column + BLACKBERRY_COLUMN[i];

            // 계산된 위치가 0 이상이면서 SIZE 미만이어야합니다.
            if (rowIndex >= 0 && rowIndex < SIZE
                    && columnIndex >= 0 && columnIndex < SIZE) {
                // 확률에 따라 열매가 심어집니다.
                if (super.isPlanting(BLACKBERRY_RATE)) plantingBonusBerry(rowIndex, columnIndex);
            }
        }
    }
}
