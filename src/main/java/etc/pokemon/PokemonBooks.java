package etc.pokemon;

public enum PokemonBooks implements Pokemon {
    GGOBUGI(30, 50),
    PICACHU(50, 10),
    PYREE(20, 40),
    PIGEON(15, 30),
    ;

    private int hp;

    private int level;

    PokemonBooks(int hp, int level) {
        this.hp = hp;
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }
}
