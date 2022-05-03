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
        System.out.println("Pikachu:  " + Arrays.toString(pikachuStats));
    }
}
