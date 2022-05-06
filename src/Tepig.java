public class Tepig implements Stats, Type, Attacks{
    public Tepig(String tepig) {
    }

    @Override
    public String attack1() {
        return "Fire Spin";
    }

    @Override
    public int attack1Damage() {
        return 0;
    }

    @Override
    public String attack2() {
        return "Flamethrower";
    }

    @Override
    public int attack2Damage() {
        return 0;
    }

    @Override
    public String attack3() {
        return "Tackle";
    }

    @Override
    public int attack3Damage() {
        return 0;
    }

    @Override
    public String attack4() {
        return "Flame Charge";
    }

    @Override
    public int attack4Damage() {
        return 0;
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

    @Override
    public String pokemonType() {
        return "Fire";
    }
}
