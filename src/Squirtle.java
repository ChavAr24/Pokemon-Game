public class Squirtle extends Pokemon{
    public Squirtle(String squirtle) {
    }

    @Override
    public String pokemonType() {
        return "Water";
    }

    @Override
    public String pokemonTypeDisadvantage() {
        return "Grass";
    }

    @Override
    public String attack1() {
        return "tackle";
    }

    @Override
    public int attack1Damage() {
        return 100;
    }

    @Override
    public String attack2() {
        return "watergun";
    }

    @Override
    public int attack2Damage() {
        return 175;
    }

    @Override
    public String attack3() {
        return "aquajet";
    }

    @Override
    public int attack3Damage() {
        return 250;
    }

    @Override
    public String attack4() {return "waterpulse";}

    @Override
    public int attack4Damage() {
        return 140;
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