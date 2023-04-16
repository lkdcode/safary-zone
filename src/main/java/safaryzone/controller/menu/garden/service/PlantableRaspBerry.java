package safaryzone.controller.menu.garden.service;

import safaryzone.user.Player;

/**
 * 블랙 베리와 같은 로직
 * 좌, 우 보너스 열매 심기 이벤트
 */
public class PlantableRaspBerry extends PlantingRate implements GardenService {
    private final int[] RASPBERRY_ROW = {-1, 1};
    private final int[] RASPBERRY_COLUMN = {0, 0};
    private final double RASPBERRY_RATE = 20.0;
    //    private final double RASPBERRY_RATE = 50.0; // TODO : TEST JYW
    private final String RASP_BERRY = "🍓";

    private final int SIZE = 5;

    @Override
    public void plantingBerry(int row, int column) {
        Player.getInstance().getGarden().planting(RASP_BERRY, row, column);
        bonusPlanting(row, column);
    }

    @Override
    public void plantingBonusBerry(int row, int column) {
        Player.getInstance().getGarden().planting(RASP_BERRY, row, column);
    }

    private void bonusPlanting(int row, int column) {
        for (int i = 0; i < RASPBERRY_COLUMN.length; i++) {
            int rowIndex = row + RASPBERRY_ROW[i];
            int columnIndex = column + RASPBERRY_COLUMN[i];

            if (rowIndex >= 0 && rowIndex < SIZE
                    && columnIndex >= 0 && columnIndex < SIZE) {
                if (super.isPlanting(RASPBERRY_RATE)) plantingBerry(rowIndex, columnIndex);
            }
        }
    }
}
