public class Tepig extends Pokemon{
    public Tepig(String tepig) {
    }

    @Override
    public String attack1() {return "firespin";}

    @Override
    public int attack1Damage() {
        return 275;
    }

    @Override
    public String attack2() {
        return "flamethrower";
    }

    @Override
    public int attack2Damage() {
        return 300;
    }

    @Override
    public String attack3() {
        return "tackle";
    }

    @Override
    public int attack3Damage() {
        return 100;
    }

    @Override
    public String attack4() {
        return "flamethrower";
    }

    @Override
    public int attack4Damage() {
        return 150;
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