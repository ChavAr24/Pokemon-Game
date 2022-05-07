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

    static String pokemons [] = {"pikachu", "charmander", "squirtle", "bulbasaur", "eevee", "tepig"}; // add more pokemons into the list if added to project.


// Add name of the pokemon to the pokemon stats.
    static String [] pikachuStats = {"Type: " + pikachu.pokemonType(), "Attacks: " + pikachu.attack1() + " " + pikachu.attack1Damage(), pikachu.attack2() + " " + pikachu.attack2Damage(), pikachu.attack3() + " " + pikachu.attack3Damage(), pikachu.attack4() + " " + pikachu.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] charmanderStats = {"Type: " + charmander.pokemonType(), "Attacks: " + charmander.attack1() + " " + charmander.attack1Damage(), charmander.attack2() + " " + charmander.attack2Damage(), charmander.attack3() + " " + charmander.attack3Damage(), charmander.attack4() + " " + charmander.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] squirtleStats = {"Type: " + squirtle.pokemonType(), "Attacks: " + squirtle.attack1() + " " + squirtle.attack1Damage(), squirtle.attack2() + " " + squirtle.attack2Damage(), squirtle.attack3() + " " + squirtle.attack3Damage(), squirtle.attack4() + " " + squirtle.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] bulbasaurStats = {"Type: " + bulbasaur.pokemonType(), "Attacks: " + bulbasaur.attack1() + " " + bulbasaur.attack1Damage(), bulbasaur.attack2() + " " + bulbasaur.attack2Damage(), bulbasaur.attack3() + " " + bulbasaur.attack3Damage(), bulbasaur.attack4() + " " + bulbasaur.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] eeveeStats = {"Type: " + eevee.pokemonType(), "Attacks: " + eevee.attack1() + " " + eevee.attack1Damage(), eevee.attack2() + " " + eevee.attack2Damage(), eevee.attack3() + " " + eevee.attack3Damage(), eevee.attack4() + " " + eevee.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] tepigStats = {"Type: " + tepig.pokemonType(), "Attacks: " + tepig.attack1() + " " + tepig.attack1Damage(), tepig.attack2() + " " + tepig.attack2Damage(), tepig.attack3() + " " + tepig.attack3Damage(), tepig.attack4() + " " + tepig.attack4Damage(), " HP: " + Pokemon.initHP()};


    public static void main(String[] args) {

        int mode = getGameMode();
        if (mode == 1){
            System.out.println("Pokemons:\nBulbasaur\nCharmander\nEevee\nPikachu\nSquirtle\nTepig");
            System.out.println("Please Choose a Pokemon player 1");
            String player1 = getPlayerPokemon();
            System.out.println("Please Choose a Pokemon player 2");
            String player2 = getPlayerPokemon();
            printPokemonStats(player1);
            printPokemonStats(player2);
            matchStart();
        }
        else {
            System.out.println("Pokemons:\nBulbasaur\nCharmander\nEevee\nPikachu\nSquirtle\nTepig");
            System.out.println("Please Choose a Pokemon for player");
            String player = getPlayerPokemon();
            String computer = getComputerPokemon();
            printPokemonStats(player);
            printPokemonStats(computer);
            matchStart();
        }

    }

    public static void printPokemonStats(String x){
        // switch (x) {
        //     case "pikachu" -> System.out.println("Pikachu:  " + Arrays.toString(pikachuStats));
        //     case "charmander" -> System.out.println("Charmander:  " + Arrays.toString(charmanderStats));
        //     case "squirtle" -> System.out.println("Squirtle:  " + Arrays.toString(squirtleStats));
        //     case "bulbasaur" -> System.out.println("Bulbasaur:  " + Arrays.toString(bulbasaurStats));
        //     case "eevee" -> System.out.println("Eevee:  " + Arrays.toString(eeveeStats));
        //     case "tepig" -> System.out.println("Tepig:  " + Arrays.toString(tepigStats));
        // }
        if (x.equals("pikachu")) {System.out.println(Arrays.toString(pikachuStats));}
        else if (x.equals("charmander")) {System.out.println(Arrays.toString(charmanderStats));}
        else if (x.equals("squirtle")) {System.out.println(Arrays.toString(squirtleStats));}
        else if (x.equals("bulbasaur")) {System.out.println(Arrays.toString(bulbasaurStats));}
        else if (x.equals("eevee")) {System.out.println(Arrays.toString(eeveeStats));}
        else if (x.equals("tepig")) {System.out.println(Arrays.toString(tepigStats));}
        
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

    public static int getPlayerAttack(){
        int playerAttack = 0;
        playerAttack = sc.nextLine();
        return -1;
    }

    public static int getResult(int a, int b){
        int victory = 0;
        int returnVal = 0;
        if (a == 10000 && b == 10000){
            victory = 1;
        }
        if (victory == 1){
            returnVal = 1;
        }
        return returnVal;
    }

    public static void matchStart(){
        int HP1 = 10000;
        int HP2 = 10000;

        while(HP1 > 0 && HP2 > 0){
            int result = getResult(HP1, HP2);
            if (result == 1){
                System.out.println("victory");
                break;
            }
            else {
                String attack = getPlayerAttack();
            }
        }
    }

    public static String getComputerPokemon(){
        Random r = new Random();
        int arrPosition = r.nextInt(pokemons.length);
        String computer = pokemons[arrPosition];
        return computer;
    }
}
