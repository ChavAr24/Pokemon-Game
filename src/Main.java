import java.util.Arrays;

/*
Name: Aryan Chavan
Date: 2 May 2022
Description:
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pikachu pikachu = new Pikachu("Pikachu");
        Charmander charmander = new Charmander("Charmander");
        Squirtle squirtle = new Squirtle("Squirtle");
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");
        Eevee eevee = new Eevee("Eevee");
        Tepig tepig = new Tepig("Tepig");

        String [] pikachuStats = {"Type: " + pikachu.pokemonType(), "Attacks: " + pikachu.attack1(), pikachu.attack2(), pikachu.attack3(), pikachu.attack4()};
        String [] charmaderStats = {"Type: " + charmander.pokemonType(), "Attacks: " + charmander.attack1(), charmander.attack2(), charmander.attack3(), charmander.attack4()};
        String [] squirtleStats = {"Type: " + squirtle.pokemonType(), "Attacks: " + squirtle.attack1(), squirtle.attack2(), squirtle.attack3(), squirtle.attack4()};
        String [] bulbasaurStats = {"Type: " + bulbasaur.pokemonType(), "Attacks: " + bulbasaur.attack1(), bulbasaur.attack2(), bulbasaur.attack3(), bulbasaur.attack4()};
        String [] eeveeStats = {"Type: " + eevee.pokemonType(), "Attacks: " + eevee.attack1(), eevee.attack2(), eevee.attack3(), eevee.attack4()};
        String [] tepigStats = {"Type: " + tepig.pokemonType(), "Attacks: " + tepig.attack1(), tepig.attack2(), tepig.attack3(), tepig.attack4()};


        Scanner sc = new Scanner(System.in);
        String pokemon = sc.nextLine();
        sc.close();
        switch (pokemon) {
            case "pikachu" -> System.out.println("Pikachu:  " + Arrays.toString(pikachuStats));
            case "charmader" -> System.out.println("Charmander:  " + Arrays.toString(charmaderStats));
            case "squirtle" -> System.out.println("Squirtle:  " + Arrays.toString(squirtleStats));
            case "bulbasaur" -> System.out.println("Bulbasaur:  " + Arrays.toString(bulbasaurStats));
            case "eevee" -> System.out.println("Eevee:  " + Arrays.toString(eeveeStats));
            case "tepig" -> System.out.println("Tepig:  " + Arrays.toString(tepigStats));
        }
    }
}
