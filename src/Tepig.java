public class Tepig implements Health, Type, Attacks{
    public Tepig(String tepig) {
    }

    @Override
    public String attack1() {
        return "Fire Spin";
    }

    @Override
    public String attack2() {
        return "Flamethrower";
    }

    @Override
    public String attack3() {
        return "Tackle";
    }

    @Override
    public String attack4() {
        return "Flame Charge";
    }

    @Override
    public int initHP() {
        return 0;
    }

    @Override
    public String pokemonType() {
        return "Fire";
    }
}
