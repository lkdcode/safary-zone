package controller.menu.garden.service;

import user.Player;

/**
 * 블랙 베리와 같은 로직
 * 상, 하 보너스 열매 심기 이벤트
 */
public class PlantableBlueBerry extends PlantingRate implements GardenService {
    private final int[] BLUEBERRY_ROW = {0, 0};
    private final int[] BLUEBERRY_COLUMN = {-1, 1};
    private final double BLUEBERRY_RATE = 30.0;
    private final String BLUE_BERRY = "🍇";
    private final int SIZE = 5;

    @Override
    public void plantingBerry(int row, int column) {
        Player.getInstance().getGarden().planting(BLUE_BERRY, row, column);
        bonusPlanting(row, column);
    }

    @Override
    public void plantingBonusBerry(int row, int column) {
        Player.getInstance().getGarden().planting(BLUE_BERRY, row, column);
    }

    private void bonusPlanting(int row, int column) {
        for (int i = 0; i < BLUEBERRY_COLUMN.length; i++) {
            int rowIndex = row + BLUEBERRY_ROW[i];
            int columnIndex = column + BLUEBERRY_COLUMN[i];

            if (rowIndex >= 0 && rowIndex < SIZE
                    && columnIndex >= 0 && columnIndex < SIZE) {
                if (super.isPlanting(BLUEBERRY_RATE)) plantingBerry(rowIndex, columnIndex);
            }
        }
    }
}
