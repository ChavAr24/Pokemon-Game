public class Eevee implements Health, Type, Attacks{
    public Eevee(String eevee) {
    }

    @Override
    public String attack1() {
        return "Tackle";
    }

    @Override
    public String attack2() {
        return "Quick Attack";
    }

    @Override
    public String attack3() {
        return "Body Slam";
    }

    @Override
    public String attack4() {
        return "Last Resort";
    }

    @Override
    public int initHP() {
        return 0;
    }

    @Override
    public String pokemonType() {
        return "Normal";
    }
}
