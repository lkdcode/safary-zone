package etc.pokemon;

public class PokemonInformation implements Pokemon {
    private Pokemon name;
    private int hp;
    private int level;

    public PokemonInformation(Builder builder) {
        this.name = builder.name;
        this.hp = builder.hp;
        this.level = builder.level;
    }

    public static class Builder {
        private Pokemon name;
        private int hp;
        private int level;

        public Builder name(Pokemon name) {
            this.name = name;
            return this;
        }

        public Builder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder level(int level) {
            this.level = level;
            return this;
        }

        public PokemonInformation build() {
            return new PokemonInformation(this);
        }
    }

    @Override
    public String toString() {
        return "PokeMonster [" +
                "name = " + name +
                ", hp = " + hp +
                ", level = " + level +
                ']';
    }
}
