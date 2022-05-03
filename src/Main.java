import java.util.Arrays;

/*
Name: Aryan Chavan
Date: 2 May 2022
Description:
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Pikachu pikachu = new Pikachu("Pikachu");
        Charmander charmander = new Charmander("Charmander");
        Squirtle squirtle = new Squirtle("Squirtle");
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");

        String [] pikachuStats = {"Type: " + pikachu.pokemonType(), "Attacks: " + pikachu.attack1(), pikachu.attack2(), pikachu.attack3(), pikachu.attack4()};
        String [] charmaderStats = {"Type: " + charmander.pokemonType(), "Attacks: " + charmander.attack1(), charmander.attack2(), charmander.attack3(), charmander.attack4()};
        String [] squirtleStats = {"Type: " + squirtle.pokemonType(), "Attacks: " + squirtle.attack1(), squirtle.attack2(), squirtle.attack3(), squirtle.attack4()};
        String [] bulbasaurStats = {"Type: " + bulbasaur.pokemonType(), "Attacks: " + bulbasaur.attack1(), bulbasaur.attack2(), bulbasaur.attack3(), bulbasaur.attack4()};

        System.out.println("Pikachu:  " + Arrays.toString(pikachuStats));
        System.out.println("Charmander:  " + Arrays.toString(charmaderStats));
        System.out.println("Squirtle:  " + Arrays.toString(squirtleStats));
        System.out.println("Bulbasaur:  " + Arrays.toString(bulbasaurStats));
    }
}
