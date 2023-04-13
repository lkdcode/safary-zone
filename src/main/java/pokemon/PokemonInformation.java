package pokemon;

/**
 * 포켓몬이 가지고 있어야할 정보입니다.
 * 생성자 패턴 중 하나인 빌더 패턴을 사용하여 생성합니다.
 */
public class PokemonInformation {
    private final int bookNumber;
    private final String name;
    private final PokemonType type;
    private int level;
    private final int hp;
    private final int damage;
    private final int skillDamage;

    public PokemonInformation(Builder builder) {
        this.bookNumber = builder.bookNumber;
        this.name = builder.name;
        this.type = builder.type;
        this.level = builder.level;
        this.hp = builder.hp;
        this.damage = builder.damage;
        this.skillDamage = builder.skillDamage;
    }

    /**
     * 빌더 패턴
     */
    public static class Builder {
        private int bookNumber;
        private String name;
        private PokemonType type;
        private int level;
        private int hp;
        private int damage;
        private int skillDamage;

        public Builder bookNumber(int bookNumber) {
            this.bookNumber = bookNumber;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(PokemonType type) {
            this.type = type;
            return this;
        }

        public Builder level(int level) {
            this.level = level;
            return this;
        }

        public Builder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder damage(int damage) {
            this.damage = damage;
            return this;
        }

        public Builder skillDamage(int skillDamage) {
            this.skillDamage = skillDamage;
            return this;
        }

        public PokemonInformation build() {
            return new PokemonInformation(this);
        }

    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getSkillDamage() {
        return skillDamage;
    }

    public void setLevel(int exp) {
        this.level += exp;
    }

    @Override
    public String toString() {
        return "📕 도감 번호 : [" + bookNumber + "]\n"
                + "📌 이름 : [" + name + "]\n"
                + "📝 속성 : [" + type + "]\n"
                + "🎚️ 레벨 : [" + level + "]\n"
                + "🩸 HP : [" + hp + "]\n"
                + "🥊 데미지 : [" + damage + "]\n"
                + "⚔️ 스킬 데미지 : [" + skillDamage + "]\n\n\n";
    }
}