public class Bulbasaur implements Type, Health, Attacks {
    public Bulbasaur(String bulbasaur) {
    }

    @Override
    public String pokemonType() {
        return "Grass";
    }

    @Override
    public String attack1() {
        return "Razor Leaf";
    }

    @Override
    public String attack2() {
        return "Wine Whip";
    }

    @Override
    public String attack3() {
        return "Solar Beam";
    }

    @Override
    public String attack4() {
        return "Tackle";
    }

    @Override
    public int initHP() {
        return 0;
    }
}
