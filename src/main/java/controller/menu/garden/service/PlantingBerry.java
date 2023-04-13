package controller.menu.garden.service;

import controller.menu.garden.exception.ErrorMessage;
import controller.menu.garden.view.InputView;
import controller.menu.garden.view.OutputView;
import user.Player;
import user.item.berry.Berry;

import java.util.Map;

import static user.item.berry.Berry.*;

/**
 * 열매 심을 위치를 선택하여 열매를 심는 클래스
 */
public class PlantingBerry {

    private final InputView inputView;
    private final OutputView outputView;
    private Map<Berry, Integer> berryPouch;
    private int[] plantLocation;
    private PlantableRaspBerry plantableRaspBerry;
    private PlantableBlueBerry plantableBlueBerry;
    private PlantableBlackBerry plantableBlackBerry;
    private int row;
    private int column;

    public PlantingBerry() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.berryPouch = Player.getInstance().getInventory().getBerryPouch()
                .getBerryPouch();
        this.plantableRaspBerry = new PlantableRaspBerry();
        this.plantableBlueBerry = new PlantableBlueBerry();
        this.plantableBlackBerry = new PlantableBlackBerry();
    }

    /**
     * 플레이어가 선택한 열매를 소지하고 있는지 확인하고
     * 소지여부에 따라 boolean 값을 리턴합니다.
     * - 열매를 소지하고 있을 시, 인벤토리에서 해당 열매를 1개 감소시킵니다. 이후 true 를 리턴합니다.
     * - 열매를 소지하고 있지 않을 시, false 를 리턴합니다.
     * @param berry: 플레이어가 심기로 선택한 열매
     * @return 열매를 갖고 있으면 true, 없으면 false
     */
    private boolean findBerry(Berry berry) {
        if (berryPouch.get(berry) != null) {
            // 열매 1개 감소
            berryPouch.put(berry, berryPouch.get(berry) - 1);
            return true;
        }
        return false;
    }

    public void plantingRaspBerry() {
        // 소지한 라즈베리가 있는지 확인
        if (findBerry(RASPBERRY)) {
            // 나의 정원을 출력하고, 심을 위치 입력
            plantLocation = plantLocationSelect();
            // 입력한 열매 위치로 plantingBerry 호출
            row = plantLocation[0];
            column = plantLocation[1];
            plantableRaspBerry.plantingBerry(row-1, column-1);
        } else ErrorMessage.NO_BERRY_ERROR.print();
    }

    public void plantingBlueBerry() {
        if (findBerry(BLUEBERRY)) {
            plantLocation = plantLocationSelect();
            row = plantLocation[0];
            column = plantLocation[1];
            plantableBlueBerry.plantingBerry(row - 1, column - 1);
        } else ErrorMessage.NO_BERRY_ERROR.print();
    }

    public void plantingBlackBerry() {
        if (findBerry(BLACKBERRY)) {
            plantLocation = plantLocationSelect();
            row = plantLocation[0];
            column = plantLocation[1];
            plantableBlackBerry.plantingBerry(row - 1, column - 1);
        } else ErrorMessage.NO_BERRY_ERROR.print();
    }

    private int[] plantLocationSelect() {
        outputView.showMyGarden();
        outputView.rowAndColumn("↔ 가로"); // row
        plantLocation[0] = inputView.inputPlantLocation();
        outputView.rowAndColumn("↕ 세로"); // column
        plantLocation[1] = inputView.inputPlantLocation();
        return plantLocation;
    }
}
