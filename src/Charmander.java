public class Charmander extends Pokemon{
    public Charmander(String charmander) {
    }

    @Override
    public String pokemonType() {
        return "Fire";
    }

    @Override
    public String pokemonTypeDisadvantage() {
        return "Water";
    }

    @Override
    public String attack1() {
        return "scratch";
    }

    @Override
    public int attack1Damage() {
        return 100;
    }

    @Override
    public String attack2() {
        return "fireblast";
    }

    @Override
    public int attack2Damage() {
        return 250;
    }

    @Override
    public String attack3() {
        return "cut";
    }

    @Override
    public int attack3Damage() {
        return 120;
    }

    @Override
    public String attack4() {
        return "flamethrower";
    }

    @Override
    public int attack4Damage() {
        return 250;
    }

    @Override
    public int speed() {
        return 50;
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
