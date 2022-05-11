public class Pikachu implements Type, Stats, Attacks {
    public Pikachu(String pikachu) {
    }

    @Override
    public String pokemonType() {
        return "Electric";
    }

    @Override
    public String attack1() {
        return "Iron tail";
    }

    @Override
    public int attack1Damage() {return 100;}

    @Override
    public String attack2() {
        return "Thunder Bolt";
    }

    @Override
    public int attack2Damage() {
        return 250;
    }

    @Override
    public String attack3() {
        return "Thunder Shock";
    }

    @Override
    public int attack3Damage() {
        return 250;
    }

    @Override
    public String attack4() {
        return "Quick Attack";
    }

    @Override
    public int attack4Damage() {
        return 140;
    }


    @Override
    public int speed() {
        return 90;
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
