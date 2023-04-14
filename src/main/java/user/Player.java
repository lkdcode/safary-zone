package user;

import pokemon.PokemonList;

import java.io.Serializable;


/**
 * 플레이어 클래스
 */
// TODO : Player 객체 저장을 위해 직렬화클래스 상속받았습니다.
public class Player implements Serializable {
    private static Player instance;
    private final int START_LEVEL = 1;
    private final int START_EXP = 0;
    private final int LEVEL_UP_POINT = 3;
    private final int MAX_LEVEL = 10;
    private PokemonList pokemonList;
    private Inventory inventory;
    private int level;
    private Garden garden;
    private int exp;

    private Player() {
        this.inventory = new Inventory();
        this.garden = new Garden();
        this.pokemonList = new PokemonList();
        this.level = START_LEVEL;
        this.exp = START_EXP;
    }

    // TODO: 유저데이터 로드받아서 객체 생성하는 걸로 변경
    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public static void load(Player player) {

            instance = player;

    }

    public Inventory getInventory() {
        return inventory;
    }

    public Garden getGarden() {
        return garden;
    }

    public int getLevel() {
        return level;
    }

    public PokemonList getPokemonList() {
        return pokemonList;
    }

    // TODO : 유저 객체 저장을 위해 getExp 추가했습니다.
    public int getExp() {
        return exp;
    }

    /**
     * 유저의 경험치를 추가하고 레벨업 조건에 해당되면 레벨업을 시켜줍니다.
     * TODO : 해당 메서드에서 전투에 참여한 포켓몬스터도 레벨업을 해줄 수 있도록 리팩터링
     *
     * @param exp
     */
    public void addExp(int exp) {
        this.exp += exp;
        if (this.exp >= LEVEL_UP_POINT
                && this.level < MAX_LEVEL) {
            this.level += this.exp / LEVEL_UP_POINT;
            this.exp %= LEVEL_UP_POINT;
        }
    }

}
