public class Charmander implements Type, Health, Attacks{
    public Charmander(String charmander) {
    }

    @Override
    public String pokemonType() {
        return "Fire";
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
