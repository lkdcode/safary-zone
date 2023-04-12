package pokemon;

public enum PokemonType {
    /**
     * 포켓몬 속성 enum
     * FIRE ⚔️ -> GRASS - 좋음. 나머지는 안 좋음
     * GRASS ⚔️ -> WATER - 좋음. 나머지는 안 좋음
     * ELECTRIC ⚔️ -> WATER - 좋음. 나머지는 안 좋음
     * WATER ⚔️ -> FIRE - 좋음. 나머지는 안 좋음
     */
    WATER, FIRE, GRASS, ELECTRIC, NORMAL
}