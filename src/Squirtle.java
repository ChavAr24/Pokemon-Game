public class Squirtle implements Type, Stats, Attacks{
    public Squirtle(String squirtle) {
    }

    @Override
    public String pokemonType() {
        return "Water";
    }

    @Override
    public String attack1() {
        return "Tackle";
    }

    @Override
    public int attack1Damage() {
        return 0;
    }

    @Override
    public String attack2() {
        return "Water Gun";
    }

    @Override
    public int attack2Damage() {
        return 0;
    }

    @Override
    public String attack3() {
        return "Aqua Jet";
    }

    @Override
    public int attack3Damage() {
        return 0;
    }

    @Override
    public String attack4() {
        return "Water Pulse";
    }

    @Override
    public int attack4Damage() {
        return 0;
    }

    @Override
    public int initHP() {
        return 10000;
    }

    @Override
    public int speed() {
        return 0;
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
