public class Pikachu implements Type, Health, Attacks {
    public Pikachu(String pikachu) {
    }

    @Override
    public String pokemonType() {
        return "Electric";
    }

    @Override
    public String attack1() {
        return "Iron tail";
    }

    @Override
    public String attack2() {
        return "Thunder Bolt";
    }

    @Override
    public String attack3() {
        return "Thunder Shock";
    }

    @Override
    public String attack4() {
        return "Quick Attack";
    }

    @Override
    public int initHP() {
        return 0;
    }
}
