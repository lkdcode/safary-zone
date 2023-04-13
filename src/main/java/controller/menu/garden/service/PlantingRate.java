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
     * @return 1 ~ 100 사이의 숫자가 열매의 확률보다 적거나 같으면 true 리턴, 크면 false 리턴
     * ex) 보너스 블루베리 심기의 확률은 10.0 입니다.
     *     랜덤 난수가 1 ~ 10 사이의 숫자일 경우 true 를 리턴, 11 ~ 100 사이의 숫자일 경우 false 를 리턴합니다.
     */
    public boolean isPlanting(double rate) {
        return (Math.random() * MAX_SIZE) + MIN_SIZE <= rate;
    }
}
