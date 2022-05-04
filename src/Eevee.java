public class Eevee implements Stats, Type, Attacks{
    public Eevee(String eevee) {
    }

    @Override
    public String attack1() {
        return "Tackle";
    }

    @Override
    public int attack1Damage() {
        return 100;
    }

    @Override
    public String attack2() {
        return "Quick Attack";
    }

    @Override
    public int attack2Damage() {
        return 150;
    }

    @Override
    public String attack3() {
        return "Body Slam";
    }

    @Override
    public int attack3Damage() {
        return 150;
    }

    @Override
    public String attack4() {
        return "Last Resort";
    }

    @Override
    public int attack4Damage() {
        return 350;
    }

    @Override
    public int initHP() {
        return 10000;
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
