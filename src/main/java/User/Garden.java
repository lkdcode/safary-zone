package user;

/**
 * 열매 심기 정원 클래스
 */
public class Garden {
    private String[][] map;
    private final int SIZE = 5;
    private final String LAWN = "🌱";

    public Garden() {
        // 초기 생성을 5x5 사이즈로 선언합니다.
        this.map = new String[SIZE][SIZE];
        initialize();
    }

    private void initialize() {
        // 초기값 null 을 🌱 로 바꿔줍니다.
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = LAWN;
            }
        }
    }

    /**
     * 🍓 🫐 ♣️ 중 하나의 열매를 매개변수로 받아 map 값을 업데이트 해줍니다.
     *
     * @param berry  : 열매 이모지
     * @param row    : row index
     * @param column : column index
     */
    public void planting(String berry, int row, int column) {
        this.map[row][column] = berry;
    }

    public String[][] getMap() {
        return map;
    }
}
