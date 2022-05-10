import java.lang.reflect.Array;
import java.util.Arrays;

/*
Name: Aryan Chavan
Date: 2 May 2022
Description:
 */

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);  // scanner for getting all the inputs
    static Random r = new Random(); // random int for computers pokemons and attacks

    // creating pokemon objects
    static Pikachu pikachu = new Pikachu("Pikachu");
    static Charmander charmander = new Charmander("Charmander");
    static Squirtle squirtle = new Squirtle("Squirtle");
    static Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");
    static Eevee eevee = new Eevee("Eevee");
    static Tepig tepig = new Tepig("Tepig");

    // getting the stats of the pokemons from the other classes and interfaces
    static String [] pikachuStats = {"Type: " + pikachu.pokemonType(), "Attacks: " + pikachu.attack1() + " " + pikachu.attack1Damage(), pikachu.attack2() + " " + pikachu.attack2Damage(), pikachu.attack3() + " " + pikachu.attack3Damage(), pikachu.attack4() + " " + pikachu.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] charmanderStats = {"Type: " + charmander.pokemonType(), "Attacks: " + charmander.attack1() + " " + charmander.attack1Damage(), charmander.attack2() + " " + charmander.attack2Damage(), charmander.attack3() + " " + charmander.attack3Damage(), charmander.attack4() + " " + charmander.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] squirtleStats = {"Type: " + squirtle.pokemonType(), "Attacks: " + squirtle.attack1() + " " + squirtle.attack1Damage(), squirtle.attack2() + " " + squirtle.attack2Damage(), squirtle.attack3() + " " + squirtle.attack3Damage(), squirtle.attack4() + " " + squirtle.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] bulbasaurStats = {"Type: " + bulbasaur.pokemonType(), "Attacks: " + bulbasaur.attack1() + " " + bulbasaur.attack1Damage(), bulbasaur.attack2() + " " + bulbasaur.attack2Damage(), bulbasaur.attack3() + " " + bulbasaur.attack3Damage(), bulbasaur.attack4() + " " + bulbasaur.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] eeveeStats = {"Type: " + eevee.pokemonType(), "Attacks: " + eevee.attack1() + " " + eevee.attack1Damage(), eevee.attack2() + " " + eevee.attack2Damage(), eevee.attack3() + " " + eevee.attack3Damage(), eevee.attack4() + " " + eevee.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] tepigStats = {"Type: " + tepig.pokemonType(), "Attacks: " + tepig.attack1() + " " + tepig.attack1Damage(), tepig.attack2() + " " + tepig.attack2Damage(), tepig.attack3() + " " + tepig.attack3Damage(), tepig.attack4() + " " + tepig.attack4Damage(), " HP: " + Pokemon.initHP()};


    // get the player vs computer working first and then we can work on the player vs player.
    public static void main(String[] args) {

        int mode = getGameMode();  // gets the gamemode weather it is going to be PvP or PvC
        if (mode == 1){  // player vs player
            String player1 = getPlayerPokemon();        // gets player1's pokemon
            String player2 = getPlayerPokemon();        // gets player2's pokemon
            printPokemonStats(player1);  // print stats
            printPokemonStats(player2);
            String victorpvp = pvpMatchStart(player1, player2);        // player vs computer match start
            String looserpvp = null;
            if (victorpvp.equals(player1)) looserpvp = player2;
            if (victorpvp.equals(player2)) looserpvp = player1;
            System.out.println(victorpvp + " has defeated " + looserpvp);
        }
        else {   // player vs computer
            String player = getPlayerPokemon();  // gets players pokemon
            printPokemonStats(player);  // print stats
            String computer = getComputerPokemon();  // gets a random pokmon for the computer.
            printPokemonStats(computer);
            String victor = pvcMatchStart(player, computer);        // player vs computer match start
            String looser = null;
            if (victor.equals(player)) looser = computer;
            if (victor.equals(computer)) looser = player;
            System.out.println(victor + " has defeated " + looser);
        }

    }

    // only attacks in list
    static String [] pikachuAttacks = {pikachu.attack1(),String.valueOf(pikachu.attack1Damage()), pikachu.attack2(), String.valueOf(pikachu.attack2Damage()), pikachu.attack3(), String.valueOf(pikachu.attack3Damage()), pikachu.attack4(), String.valueOf(pikachu.attack4Damage())};
    static String [] charmanderAttacks = {charmander.attack1(), String.valueOf(charmander.attack1Damage()), charmander.attack2(), String.valueOf(charmander.attack2Damage()), charmander.attack3(), String.valueOf(charmander.attack3Damage()), charmander.attack4(), String.valueOf(charmander.attack4Damage())};
    static String [] squirtleAttacks = {squirtle.attack1(), String.valueOf(squirtle.attack1Damage()), squirtle.attack2(), String.valueOf(squirtle.attack2Damage()), squirtle.attack3(), String.valueOf(squirtle.attack3Damage()), squirtle.attack4(), String.valueOf(squirtle.attack4Damage())};
    static String [] bulbasaurAttacks = {bulbasaur.attack1(), String.valueOf(bulbasaur.attack1Damage()), bulbasaur.attack2(), String.valueOf(bulbasaur.attack2Damage()), bulbasaur.attack3(), String.valueOf(bulbasaur.attack3Damage()), bulbasaur.attack4(), String.valueOf(bulbasaur.attack4Damage())};
    static String [] eeveeAttacks = {eevee.attack1(), String.valueOf(eevee.attack1Damage()), eevee.attack2(), String.valueOf(eevee.attack2Damage()), eevee.attack3(), String.valueOf(eevee.attack3Damage()), eevee.attack4(), String.valueOf(eevee.attack4Damage())};
    static String [] tepigAttacks = {tepig.attack1(), String.valueOf(tepig.attack1Damage()), tepig.attack2(), String.valueOf(tepig.attack2Damage()), tepig.attack3(), String.valueOf(tepig.attack3Damage()), tepig.attack4(), String.valueOf(tepig.attack4Damage())};

    public static String pvpMatchStart(String player1, String player2){
        int hpPlayer1 = 10000;
        int hpPlayer2 = 10000;
        String victor = null;
        ArrayList<String> player1Attacks = new ArrayList<>();
        ArrayList<String> player2Attacks = new ArrayList<>();

        switch (player1){           // temporarily in this method and i will make a second method just for this so that it looks a bit more neat.
            case "pikachu":
                for (int i = 0; i < pikachuAttacks.length; i++){
                    player1Attacks.add(pikachuAttacks[i]);
                }
            case "charmander":
                for (int i = 0; i < charmanderAttacks.length; i++){
                    player1Attacks.add(charmanderAttacks[i]);
                }
            case "bulbasaur":
                for (int i = 0; i < bulbasaurAttacks.length; i++){
                    player1Attacks.add(bulbasaurAttacks[i]);
                }
            case "squirtle":
                for (int i = 0; i < squirtleAttacks.length; i++){
                    player1Attacks.add(squirtleAttacks[i]);
                }
            case "tepig":
                for (int i = 0; i < tepigAttacks.length; i++){
                    player1Attacks.add(tepigAttacks[i]);
                }
            case "eevee":
                for (int i = 0; i < eeveeAttacks.length; i++){
                    player1Attacks.add(eeveeAttacks[i]);
                }
        }
        switch (player2){
            case "pikachu":
                for (int i = 0; i < pikachuAttacks.length; i++){
                    player2Attacks.add(pikachuAttacks[i]);
                }
            case "charmander":
                for (int i = 0; i < charmanderAttacks.length; i++){
                    player2Attacks.add(charmanderAttacks[i]);
                }
            case "bulbasaur":
                for (int i = 0; i < bulbasaurAttacks.length; i++){
                    player2Attacks.add(bulbasaurAttacks[i]);
                }
            case "squirtle":
                for (int i = 0; i < squirtleAttacks.length; i++){
                    player2Attacks.add(squirtleAttacks[i]);
                }
            case "tepig":
                for (int i = 0; i < tepigAttacks.length; i++){
                    player2Attacks.add(tepigAttacks[i]);
                }
            case "eevee":
                for (int i = 0; i < eeveeAttacks.length; i++){
                    player2Attacks.add(eeveeAttacks[i]);
                }
        }

        return victor;
    }

    public static String pvcMatchStart(String player, String computer){
        int hpPlayer = 400;  // 400 for testing purposes
        int hpComputer = 400; // 400 for testing purposes
        String victor = null;
        ArrayList<String> playerAttacks = new ArrayList<String>();

        if ("pikachu".equals(player)) {
            for (int i = 0; i < pikachuAttacks.length; i++) {
                playerAttacks.add(pikachuAttacks[i]);
            }
        }
        else if ("charmander".equals(player)) {
            for (int i = 0; i < charmanderAttacks.length; i++) {;
                playerAttacks.add(charmanderAttacks[i]);
            }
        }
        else if ("bulbasaur".equals(player)) {
            for (int i = 0; i < bulbasaurAttacks.length; i++) {
                playerAttacks.add(bulbasaurAttacks[i]);
            }
        }
        else if ("squirtle".equals(player)) {
            for (int i = 0; i < squirtleAttacks.length; i++) {
                playerAttacks.add(squirtleAttacks[i]);
            }
        }
        else if ("tepig".equals(player)) {
            for (int i = 0; i < tepigAttacks.length; i++) {
                playerAttacks.add(tepigAttacks[i]);
            }
        }
        else if ("eevee".equals(player)) {
            for (int i = 0; i < eeveeAttacks.length; i++) {
                playerAttacks.add(eeveeAttacks[i]);
            }
        }


        while(hpComputer > 0 || hpPlayer > 0){      // while loop while the healths of both pokemons are greater than 0
            if (hpComputer < 1 && hpPlayer > 0){
                victor = player;
                break;
            }
            else if (hpComputer > 0 && hpPlayer < 1){
                victor = computer;
                break;
            }

            // players turn to attack
            System.out.println(player + " Attacks: \n" + playerAttacks);
            String playerAttack = getPlayerAttack();
            if (playerAttacks.contains(playerAttack)){
                System.out.println(playerAttack + " was used by " + player);
                int attackDamagePositionPlayer = playerAttacks.indexOf(playerAttack);
                int attackDamagePlayer = Integer.parseInt(playerAttacks.get(attackDamagePositionPlayer + 1));
                hpComputer -= attackDamagePlayer;
                System.out.println(attackDamagePlayer + " damage was done to " + computer);
                if (hpComputer <= 0) hpComputer = 0;
                if (hpPlayer <= 0) hpPlayer = 0;
                System.out.println("Computer Health: " + hpComputer + "\nPlayer Health: " + hpPlayer);
            }

            // computer turn to attack
            String computerAttack = getComputerAttack(computer);
            if (playerAttacks.contains(playerAttack)){
                System.out.println(computerAttack + " was used by " + computer);
                int attackDamagePositionComputer = playerAttacks.indexOf(playerAttack);
                int attackDamageComputer = Integer.parseInt(playerAttacks.get(attackDamagePositionComputer + 1));
                hpComputer -= attackDamageComputer;
                System.out.println(attackDamageComputer + " damage was done to " + computer);
                if (hpComputer <= 0) hpComputer = 0;
                if (hpPlayer <= 0) hpPlayer = 0;
                System.out.println("Computer Health: " + hpComputer + "\nPlayer Health: " + hpPlayer);
            }
        }


        return victor;
    }

    public static String getComputerAttack(String computer){
        String attack = null;
        if(computer.equals("pikachu")) attack = pikachuAttacks[(r.nextInt(pikachuAttacks.length))];
        else if(computer.equals("charmander")) attack = charmanderAttacks[(r.nextInt(charmanderAttacks.length))];
        else if(computer.equals("bulbasaur")) attack = bulbasaurAttacks[(r.nextInt(bulbasaurAttacks.length))];
        else if(computer.equals("squirtle")) attack = squirtleAttacks[(r.nextInt(squirtleAttacks.length))];
        else if(computer.equals("tepig")) attack = tepigAttacks[(r.nextInt(tepigAttacks.length))];
        else if(computer.equals("eevee")) attack = eeveeAttacks[(r.nextInt(eeveeAttacks.length))];
        return attack;
    }

    public static String getPlayerAttack(){
        String attack = null;
        System.out.println("Player input an attack:");
        attack = sc.nextLine();
        return attack;
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
        System.out.println("Please Choose a Pokemon");
        String pokemon = sc.nextLine();
        return pokemon;
    }

    public static int getGameMode(){
        System.out.println("Which mode would you like to play in\n1) Player vs Player\n2) Player vs Computer");
        int modeInput = Integer.parseInt(sc.nextLine());
        return modeInput;
    }
    public static String getComputerPokemon(){
        String [] pokemons = {"pikachu", "charmander", "tepig", "squirtle", "eevee", "bulbasaur"};

        String pokemon = pokemons[r.nextInt(pokemons.length)];
        return pokemon;
    }
}
