public class Bulbasaur implements Type, Stats, Attacks {
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
    public int attack1Damage() {
        return 100;
    }

    @Override
    public String attack2() {
        return "Vine Whip";
    }

    @Override
    public int attack2Damage() {
        return 75;
    }

    @Override
    public String attack3() {
        return "Solar Beam";
    }

    @Override
    public int attack3Damage() {
        return 350;
    }

    @Override
    public String attack4() {
        return "Tackle";
    }

    @Override
    public int attack4Damage() {
        return 90;
    }

    @Override
    public int initHP() {
        return 10000;
    }

    @Override
    public int speed() {
        return 45;
    }

    @Override
    public int def() {
        return 0;
    }

    @Override
    public int attack() {
        return 0;
    }
}
