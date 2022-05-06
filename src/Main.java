import java.util.Arrays;

/*
Name: Aryan Chavan
Date: 2 May 2022
Description:
 */

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Pikachu pikachu = new Pikachu("Pikachu");
    static Charmander charmander = new Charmander("Charmander");
    static Squirtle squirtle = new Squirtle("Squirtle");
    static Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");
    static Eevee eevee = new Eevee("Eevee");
    static Tepig tepig = new Tepig("Tepig");

    static String [] pikachuStats = {"Type: " + pikachu.pokemonType(), "Attacks: " + pikachu.attack1() + " " + pikachu.attack1Damage(), pikachu.attack2() + " " + pikachu.attack2Damage(), pikachu.attack3() + " " + pikachu.attack3Damage(), pikachu.attack4() + " " + pikachu.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] charmanderStats = {"Type: " + charmander.pokemonType(), "Attacks: " + charmander.attack1() + " " + charmander.attack1Damage(), charmander.attack2() + " " + charmander.attack2Damage(), charmander.attack3() + " " + charmander.attack3Damage(), charmander.attack4() + " " + charmander.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] squirtleStats = {"Type: " + squirtle.pokemonType(), "Attacks: " + squirtle.attack1() + " " + squirtle.attack1Damage(), squirtle.attack2() + " " + squirtle.attack2Damage(), squirtle.attack3() + " " + squirtle.attack3Damage(), squirtle.attack4() + " " + squirtle.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] bulbasaurStats = {"Type: " + bulbasaur.pokemonType(), "Attacks: " + bulbasaur.attack1() + " " + bulbasaur.attack1Damage(), bulbasaur.attack2() + " " + bulbasaur.attack2Damage(), bulbasaur.attack3() + " " + bulbasaur.attack3Damage(), bulbasaur.attack4() + " " + bulbasaur.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] eeveeStats = {"Type: " + eevee.pokemonType(), "Attacks: " + eevee.attack1() + " " + eevee.attack1Damage(), eevee.attack2() + " " + eevee.attack2Damage(), eevee.attack3() + " " + eevee.attack3Damage(), eevee.attack4() + " " + eevee.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] tepigStats = {"Type: " + tepig.pokemonType(), "Attacks: " + tepig.attack1() + " " + tepig.attack1Damage(), tepig.attack2() + " " + tepig.attack2Damage(), tepig.attack3() + " " + tepig.attack3Damage(), tepig.attack4() + " " + tepig.attack4Damage(), " HP: " + Pokemon.initHP()};


    public static void main(String[] args) {
	// write your code here


        System.out.println( Arrays.toString(pikachuStats));
        System.out.println( Arrays.toString(charmanderStats));
        System.out.println( Arrays.toString(squirtleStats));
        System.out.println( Arrays.toString(bulbasaurStats));
        System.out.println( Arrays.toString(eeveeStats));
        System.out.println( Arrays.toString(tepigStats));

        int mode = getGameMode();
        if (mode == 1){
            String player1 = getPlayerPokemon();
            String player2 = getPlayerPokemon();
            printPokemonStats(player1);
            printPokemonStats(player2);
        }
        else {
            System.out.println("Playing Player vs computer");
        }

    }

    public static void printPokemonStats(String x){
        switch (x) {
            case "pikachu" -> System.out.println("Pikachu:  " + Arrays.toString(pikachuStats));
            case "charmander" -> System.out.println("Charmander:  " + Arrays.toString(charmanderStats));
            case "squirtle" -> System.out.println("Squirtle:  " + Arrays.toString(squirtleStats));
            case "bulbasaur" -> System.out.println("Bulbasaur:  " + Arrays.toString(bulbasaurStats));
            case "eevee" -> System.out.println("Eevee:  " + Arrays.toString(eeveeStats));
            case "tepig" -> System.out.println("Tepig:  " + Arrays.toString(tepigStats));
        }
    }

    public static String getPlayerPokemon(){
        String pokemon = sc.nextLine();
        return pokemon;
    }

    public static int getGameMode(){
        System.out.println("Which mode would you like to play in\n1) Player vs Computer\n2) Player vs Player");
        int modeInput = Integer.parseInt(sc.nextLine());
        return modeInput;
    }
}
