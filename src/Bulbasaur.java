public class Bulbasaur implements Type, Health, Attacks {
    public Bulbasaur(String bulbasaur) {
    }

    @Override
    public String pokemonType() {
        return "Grass";
    }

    @Override
    public String attack1() {
        return null;
    }

    @Override
    public String attack2() {
        return null;
    }

    @Override
    public String attack3() {
        return null;
    }

    @Override
    public String attack4() {
        return null;
    }

    @Override
    public int initHP() {
        return 0;
    }
}
