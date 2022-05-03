public class Squirtle implements Type, Health, Attacks{
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
    public String attack2() {
        return "Water Gun";
    }

    @Override
    public String attack3() {
        return "Aqua Jet";
    }

    @Override
    public String attack4() {
        return "Water Pulse";
    }

    @Override
    public int initHP() {
        return 0;
    }
}
