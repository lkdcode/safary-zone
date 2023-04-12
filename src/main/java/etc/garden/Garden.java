package etc.garden;

public class Garden {
    private int[][] gardenArr;
    private static final int SIZE = 5;

    public Garden() {
        gardenArr = new int[SIZE][SIZE];
    }

    public int[][] getGardenArr() {
        return gardenArr;
    }

}