public class Mankey extends Pokemon{
    public Mankey(String mankey) {}

    @Override
    public String attack1() {return "lowkick";}

    @Override
    public int attack1Damage() {return 160;}

    @Override
    public String attack2() {return "crosschop";}

    @Override
    public int attack2Damage() {return 250;}

    @Override
    public String attack3() {return "closecombat";}

    @Override
    public int attack3Damage() {return 250;}

    @Override
    public String attack4() {return "scratch";}

    @Override
    public int attack4Damage() {return 100;}

    @Override
    public int speed() {return 0;}

    @Override
    public int def() {return 0;}

    @Override
    public int attack() {return 0;}

    @Override
    public String pokemonType() {return "Fighting";}
}
