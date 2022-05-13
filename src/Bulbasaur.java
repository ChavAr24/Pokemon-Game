public class Bulbasaur extends Pokemon {
    public Bulbasaur(String bulbasaur) {
    }

    @Override
    public String pokemonType() {
        return "Grass";
    }

    @Override
    public String attack1() {
        return "razorleaf";
    }

    @Override
    public int attack1Damage() {
        return 125;
    }

    @Override
    public String attack2() {
        return "vinewhip";
    }

    @Override
    public int attack2Damage() {
        return 150;
    }

    @Override
    public String attack3() {
        return "solarbeam";
    }

    @Override
    public int attack3Damage() {
        return 350;
    }

    @Override
    public String attack4() {return "tackle";}

    @Override
    public int attack4Damage() {
        return 125;
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
