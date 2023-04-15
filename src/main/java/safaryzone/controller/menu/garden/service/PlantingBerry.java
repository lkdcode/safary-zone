package safaryzone.controller.menu.garden.service;

import safaryzone.controller.menu.garden.exception.ErrorMessage;
import safaryzone.controller.menu.garden.view.InputValidate;
import safaryzone.controller.menu.garden.view.InputView;
import safaryzone.controller.menu.garden.view.OutputView;
import safaryzone.user.Player;
import safaryzone.user.item.berry.Berry;
import safaryzone.user.item.berry.BerryPouch;

import static safaryzone.user.item.berry.Berry.*;

/**
 * 열매 심을 위치를 선택하여 열매를 심는 클래스
 */
public class PlantingBerry {

    private final InputView inputView;
    private final OutputView outputView;
    private BerryPouch berryPouch;
    private int[] plantLocation;
    private PlantableRaspBerry plantableRaspBerry;
    private PlantableBlueBerry plantableBlueBerry;
    private PlantableBlackBerry plantableBlackBerry;
    private InputValidate inputValidate;
    private int row;
    private int column;

    public PlantingBerry() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.berryPouch = Player.getInstance().getInventory().getBerryPouch();
        this.plantLocation = new int[2];
        this.plantableRaspBerry = new PlantableRaspBerry();
        this.plantableBlueBerry = new PlantableBlueBerry();
        this.plantableBlackBerry = new PlantableBlackBerry();
        this.inputValidate = new InputValidate();
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
        if (berryPouch.getBerryPouch().get(berry) != null) {
            if (berryPouch.getBerryPouch().get(berry) > 0) {
                // 열매 1개 감소
                berryPouch.useOneBerry(berry);
                return true;
            }
        }
        return false;
    }


    public void plantingBlueBerry() {
        // 소지한 블루베리가 있는지 확인
        if (findBerry(BLUEBERRY)) {
            // 나의 정원을 출력하고, 심을 위치 입력
            plantLocation = plantLocationSelect();
            // 입력한 열매 위치로 plantingBerry 호출
            row = plantLocation[0];
            column = plantLocation[1];
            plantableBlueBerry.plantingBerry(row, column);
        } else ErrorMessage.NO_BERRY_ERROR.print();
    }

    public void plantingRaspBerry() {
        if (findBerry(RASPBERRY)) {
            plantLocation = plantLocationSelect();
            row = plantLocation[0];
            column = plantLocation[1];
            plantableRaspBerry.plantingBerry(row, column);
        } else ErrorMessage.NO_BERRY_ERROR.print();
    }

    public void plantingBlackBerry() {
        if (findBerry(BLACKBERRY)) {
            plantLocation = plantLocationSelect();
            row = plantLocation[0];
            column = plantLocation[1];
            plantableBlackBerry.plantingBerry(row, column);
        } else ErrorMessage.NO_BERRY_ERROR.print();
    }

    /**
     * 
     * @return
     */
    private int[] plantLocationSelect() {
        while(true) {
            // 심을 위치를 확인하기 위해 플레이어의 정원 출력
            outputView.showMyGarden();
            // 1. 입력한 위치를 범위 안으로 입력했는지 검사
            outputView.rowAndColumn("↕ 세로"); // row
            plantLocation[0] = inputView.inputPlantLocation();
            outputView.rowAndColumn("↔ 가로"); // column
            plantLocation[1] = inputView.inputPlantLocation();
            // 1. 입력한 위치가 이미 열매가 심어진 곳인지 검사
            if (!inputValidate.plantingBerryValidate(plantLocation[0], plantLocation[1])) {
                ErrorMessage.ALREADY_PLANTED_ERROR.print();
                continue;
            }
            return plantLocation;
        }
    }
}
