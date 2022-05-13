public class Eevee extends Pokemon {
    public Eevee(String eevee) {
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
        return "quickattack";
    }

    @Override
    public int attack2Damage() {
        return 150;
    }

    @Override
    public String attack3() {
        return "bodyslam";
    }

    @Override
    public int attack3Damage() {
        return 200;
    }

    @Override
    public String attack4() {
        return "lastresort";
    }

    @Override
    public int attack4Damage() {
        return 350;
    }

    @Override
    public int speed() {
        return 80;
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
        return "Normal";
    }
}
