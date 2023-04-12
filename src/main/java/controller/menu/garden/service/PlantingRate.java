package controller.menu.garden.service;

/**
 * 열매 심을 확률을 계산해주는 클래스
 */
public class PlantingRate {
    private final int MAX_SIZE = 100;
    private final int MIN_SIZE = 1;

    public PlantingRate() {
    }

    /**
     * 해당 열매의 확률을 매개변수로 입력받아
     * boolean 으로 리턴해줍니다.
     *
     * @param rate : 해당 열매가 가지고 있는 확률
     * @return
     */
    public boolean isPlanting(double rate) {
        return (Math.random() * MAX_SIZE) + MIN_SIZE <= rate;
    }

}
