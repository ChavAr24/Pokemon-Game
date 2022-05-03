public class Charmander implements Type, Health, Attacks{
    public Charmander(String charmander) {
    }

    @Override
    public String pokemonType() {
        return "Fire";
    }

    @Override
    public String attack1() {
        return "Scratch";
    }

    @Override
    public String attack2() {
        return "Fire Blast";
    }

    @Override
    public String attack3() {
        return "Flame Charge";
    }

    @Override
    public String attack4() {
        return "Flamethrower";
    }

    @Override
    public int initHP() {
        return 0;
    }
}
