package controller.menu.garden.service;

import user.Player;

/**
 * 블랙 베리와 같은 로직
 */
public class PlantableRaspBerry extends PlantingRate implements GardenService {
    private final int[] RASPBERRY_ROW = {0, 0};
    private final int[] RASPBERRY_COLUMN = {-1, 1};
    private final double RASPBERRY_RATE = 20.0;
    private final String RASP_BERRY = "🍓";

    private final int SIZE = 5;

    @Override
    public void plantingBerry(int row, int column, int escape) {
        Player.getInstance().getGarden().planting(RASP_BERRY, row, column);
        if (escape == 0) {
            bonusPlanting(row, column);
        }
    }

    private void bonusPlanting(int row, int column) {
        for (int i = 0; i < RASPBERRY_COLUMN.length; i++) {
            int rowIndex = row + RASPBERRY_ROW[i];
            int columnIndex = column + RASPBERRY_COLUMN[i];

            if (rowIndex >= 0 && rowIndex < SIZE
                    && columnIndex >= 0 && columnIndex < SIZE) {
                if (super.isPlanting(RASPBERRY_RATE)) plantingBerry(rowIndex, columnIndex, 1);
            }
        }
    }
}
