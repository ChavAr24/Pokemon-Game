public class Zubat extends Pokemon{
    public Zubat(String zubat) {}

    @Override
    public String attack1() {return "shadowball";}

    @Override
    public int attack1Damage() {return 300;}

    @Override
    public String attack2() {return "aircutter";}

    @Override
    public int attack2Damage() {return 150;}

    @Override
    public String attack3() {return "airslash";}

    @Override
    public int attack3Damage() {return 250;}

    @Override
    public String attack4() {return "gust";}

    @Override
    public int attack4Damage() {return 100;}

    @Override
    public int speed() {return 0;}

    @Override
    public int def() {return 0;}

    @Override
    public int attack() {return 0;}

    @Override
    public String pokemonType() {return "Flying";}
}
