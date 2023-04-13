package controller.menu.garden.service;

public interface GardenService {

    /**
     * 열매를 심는 추상 메서드
     * @param row    : row Index
     * @param column : column Index
     */
    void plantingBerry(int row, int column);
    void plantingBonusBerry(int row, int column);

}
