/*
Name: Aryan Chavan
Date: 2 May 2022
Description: A Pokemon Game
 */
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);  // scanner for getting all the inputs
    static Random r = new Random(); // random int for computers pokemon and attacks

    // creating pokemon objects
    static Pikachu pikachu = new Pikachu("Pikachu");
    static Charmander charmander = new Charmander("Charmander");
    static Squirtle squirtle = new Squirtle("Squirtle");
    static Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur");
    static Eevee eevee = new Eevee("Eevee");
    static Tepig tepig = new Tepig("Tepig");
    static Zubat zubat = new Zubat("Zubat");
    static Mankey mankey = new Mankey("Mankey");

    // getting the stats of the Pokemon from the other classes and interfaces
    static String [] pikachuStats = {"Type: " + pikachu.pokemonType(), "Attacks: " + pikachu.attack1() + " " + pikachu.attack1Damage(), pikachu.attack2() + " " + pikachu.attack2Damage(), pikachu.attack3() + " " + pikachu.attack3Damage(), pikachu.attack4() + " " + pikachu.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] charmanderStats = {"Type: " + charmander.pokemonType(), "Attacks: " + charmander.attack1() + " " + charmander.attack1Damage(), charmander.attack2() + " " + charmander.attack2Damage(), charmander.attack3() + " " + charmander.attack3Damage(), charmander.attack4() + " " + charmander.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] squirtleStats = {"Type: " + squirtle.pokemonType(), "Attacks: " + squirtle.attack1() + " " + squirtle.attack1Damage(), squirtle.attack2() + " " + squirtle.attack2Damage(), squirtle.attack3() + " " + squirtle.attack3Damage(), squirtle.attack4() + " " + squirtle.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] bulbasaurStats = {"Type: " + bulbasaur.pokemonType(), "Attacks: " + bulbasaur.attack1() + " " + bulbasaur.attack1Damage(), bulbasaur.attack2() + " " + bulbasaur.attack2Damage(), bulbasaur.attack3() + " " + bulbasaur.attack3Damage(), bulbasaur.attack4() + " " + bulbasaur.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] eeveeStats = {"Type: " + eevee.pokemonType(), "Attacks: " + eevee.attack1() + " " + eevee.attack1Damage(), eevee.attack2() + " " + eevee.attack2Damage(), eevee.attack3() + " " + eevee.attack3Damage(), eevee.attack4() + " " + eevee.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] tepigStats = {"Type: " + tepig.pokemonType(), "Attacks: " + tepig.attack1() + " " + tepig.attack1Damage(), tepig.attack2() + " " + tepig.attack2Damage(), tepig.attack3() + " " + tepig.attack3Damage(), tepig.attack4() + " " + tepig.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] zubatStats = {"Type: " + zubat.pokemonType(), "Attacks: " + zubat.attack1() + " " + zubat.attack1Damage(), zubat.attack2() + " " + zubat.attack2Damage(), zubat.attack3() + " " + zubat.attack3Damage(), zubat.attack4() + " " + zubat.attack4Damage(), " HP: " + Pokemon.initHP()};
    static String [] mankeyStats = {"Type: " + mankey.pokemonType(), "Attacks: " + mankey.attack1() + " " + mankey.attack1Damage(), mankey.attack2() + " " + mankey.attack2Damage(), mankey.attack3() + " " + mankey.attack3Damage(), mankey.attack4() + " " + mankey.attack4Damage(), " HP: " + Pokemon.initHP()};

    public static void main(String[] args) {
        int mode = getGameMode();  // gets the game mode weather it is going to be PvP or PvC
        System.out.println(Arrays.toString(pokemons));  // prints the list of the Pokemon in the console.
        if (mode == 1){  // player vs player
            String player1 = getPlayerPokemon();        // gets player1's pokemon
            String player2 = getPlayerPokemon();        // gets player2's pokemon
            printPokemonStats(player1);  // print stats
            printPokemonStats(player2);
            String victorpvp = pvpMatchStart(player1, player2);        // player vs computer match start
            String looserpvp = null;    // variable to hold the name of the looser
            if (victorpvp.equals(player1)) looserpvp = player2; // looser is player 2 if player 1 won
            if (victorpvp.equals(player2)) looserpvp = player1; // looser is player 1 if player 2 won
            System.out.println(victorpvp + " has defeated " + looserpvp); // prints the final statement saying who won and who lost
        }
        else {   // player vs computer
            String player = getPlayerPokemon();  // gets players pokemon
            printPokemonStats(player);  // print stats
            String computer = getComputerPokemon();  // gets a random pokemon for the computer.
            printPokemonStats(computer);  // prints computers stats
            String victor = pvcMatchStart(player, computer);        // player vs computer match start
            String looser = null;
            if (victor.equals(player)) looser = computer;
            if (victor.equals(computer)) looser = player;
            System.out.println(victor + " has defeated " + looser);
        }

    }

    // attacks and their damages of the Pokemon in list
    static String [] pikachuAttacks = {pikachu.attack1(),String.valueOf(pikachu.attack1Damage()), pikachu.attack2(), String.valueOf(pikachu.attack2Damage()), pikachu.attack3(), String.valueOf(pikachu.attack3Damage()), pikachu.attack4(), String.valueOf(pikachu.attack4Damage())};
    static String [] charmanderAttacks = {charmander.attack1(), String.valueOf(charmander.attack1Damage()), charmander.attack2(), String.valueOf(charmander.attack2Damage()), charmander.attack3(), String.valueOf(charmander.attack3Damage()), charmander.attack4(), String.valueOf(charmander.attack4Damage())};
    static String [] squirtleAttacks = {squirtle.attack1(), String.valueOf(squirtle.attack1Damage()), squirtle.attack2(), String.valueOf(squirtle.attack2Damage()), squirtle.attack3(), String.valueOf(squirtle.attack3Damage()), squirtle.attack4(), String.valueOf(squirtle.attack4Damage())};
    static String [] bulbasaurAttacks = {bulbasaur.attack1(), String.valueOf(bulbasaur.attack1Damage()), bulbasaur.attack2(), String.valueOf(bulbasaur.attack2Damage()), bulbasaur.attack3(), String.valueOf(bulbasaur.attack3Damage()), bulbasaur.attack4(), String.valueOf(bulbasaur.attack4Damage())};
    static String [] eeveeAttacks = {eevee.attack1(), String.valueOf(eevee.attack1Damage()), eevee.attack2(), String.valueOf(eevee.attack2Damage()), eevee.attack3(), String.valueOf(eevee.attack3Damage()), eevee.attack4(), String.valueOf(eevee.attack4Damage())};
    static String [] tepigAttacks = {tepig.attack1(), String.valueOf(tepig.attack1Damage()), tepig.attack2(), String.valueOf(tepig.attack2Damage()), tepig.attack3(), String.valueOf(tepig.attack3Damage()), tepig.attack4(), String.valueOf(tepig.attack4Damage())};
    static String [] zubatAttacks = {zubat.attack1(), String.valueOf(zubat.attack1Damage()), zubat.attack2(), String.valueOf(zubat.attack2Damage()), zubat.attack3(), String.valueOf(zubat.attack3Damage()), zubat.attack4(), String.valueOf(zubat.attack4Damage())};
    static String [] mankeyAttacks = {mankey.attack1(), String.valueOf(mankey.attack1Damage()), mankey.attack2(), String.valueOf(mankey.attack2Damage()), mankey.attack3(), String.valueOf(mankey.attack3Damage()), mankey.attack4(), String.valueOf(mankey.attack4Damage())};

  // attack names of the attacks for each pokemon for the computer to choose from
    static String [] pikachuAttackCP = {pikachu.attack1(), pikachu.attack2(), pikachu.attack3(), pikachu.attack4()};
    static String [] charmanderAttackCP = {charmander.attack1(), charmander.attack2(), charmander.attack3(), charmander.attack4()};
    static String [] squirtleAttackCP = {squirtle.attack1(), squirtle.attack2(), squirtle.attack3(), squirtle.attack4()};
    static String [] bulbasaurAttackCP = {bulbasaur.attack1(), bulbasaur.attack2(), bulbasaur.attack3(), bulbasaur.attack4()};
    static String [] eeveeAttackCP = {eevee.attack1(), eevee.attack2(), eevee.attack3(), eevee.attack4()};
    static String [] tepigAttackCP = {tepig.attack1(), tepig.attack2(), tepig.attack3(), tepig.attack4()};
    static String [] zubatAttackCP = {zubat.attack1(), zubat.attack2(), zubat.attack3(), zubat.attack4()};
    static String [] mankeyAttackCP = {mankey.attack1(), mankey.attack2(), mankey.attack3(), mankey.attack4()};

    static String [] stadiums = {"Electric", "Fire", "Water", "Grass", "Fighting", "Flying", "Normal"};     // types of the stadiums the match will take place in
    public static int getFinalHealth(int stdNum, String player){    // gets the final health of the pokemon after the stadium is randomly chosen.
        int health = 2000; // initial health of every pokemon

        switch (player) {
            case "pikachu": // if stadium is electric then pikachu gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(pikachu.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(pikachu.pokemonTypeDisadvantage())) health = health - 200;
                break;
            case "charmander": // if stadium is fire then charmander gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(charmander.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(charmander.pokemonTypeDisadvantage())) health = health - 200;
                break;
            case "squirtle": // if stadium is water then squirtle gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(squirtle.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(squirtle.pokemonTypeDisadvantage())) health = health - 200;
                break;
            case "bulbasaur": // if stadium is grass then bulbasaur gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(bulbasaur.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(bulbasaur.pokemonTypeDisadvantage())) health = health - 200;
                break;
            case "eevee": // if stadium is normal then eevee gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(eevee.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(eevee.pokemonTypeDisadvantage())) health = health - 200;
                break;
            case "tepig": // if stadium is fire then tepig gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(tepig.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(tepig.pokemonTypeDisadvantage())) health = health - 200;
                break;
            case "zubat": // if stadium is flying then zubat gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(zubat.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(zubat.pokemonTypeDisadvantage())) health = health - 200;
                break;
            case "mankey": // if stadium is fighting then mankey gets a health boost else if the stadium is the same as the type of weakness it takes away some health
                if (stadiums[stdNum].equals(mankey.pokemonType())) health = health + 200;
                else if (stadiums[stdNum].equals(mankey.pokemonTypeDisadvantage())) health = health - 200;
                break;
        }
        return health;  // returns the final health
    }

    public static String pvpMatchStart(String player1, String player2){  // player vs player match
      int hpPlayer1 = 2000; // 400 for testing purposes
      int hpPlayer2 = 2000; // 400 for testing purposes
      String victor;
      ArrayList<String> player1Attacks = new ArrayList<>(); // arraylist for storing the attacks of the player 1
      ArrayList<String> player2Attacks = new ArrayList<>(); // arraylist for storing the attacks of the player 2
      int stadiumNum = r.nextInt(7); // gets a random number which will be used to choose the stadium randomly
      hpPlayer1 = getFinalHealth(stadiumNum, player1);  // gets the final health of pokemon with the stadium number
      hpPlayer2 = getFinalHealth(stadiumNum, player2);
      System.out.println("-----------------------------------------------------------------\nStadium: " + stadiums[stadiumNum] + "\nHP1 " + player1 + ": " + hpPlayer1 + "\nHP2 " + player2 + ": " + hpPlayer2);

      // adds the names of the attacks to the player1's list according to the name of the pokemon they chose
      if ("pikachu".equals(player1)) Collections.addAll(player1Attacks, pikachuAttacks);
      else if ("charmander".equals(player1)) player1Attacks.addAll(Arrays.asList(charmanderAttacks));
      else if ("bulbasaur".equals(player1)) Collections.addAll(player1Attacks, bulbasaurAttacks);
      else if ("squirtle".equals(player1)) Collections.addAll(player1Attacks, squirtleAttacks);
      else if ("tepig".equals(player1)) Collections.addAll(player1Attacks, tepigAttacks);
      else if ("eevee".equals(player1)) Collections.addAll(player1Attacks, eeveeAttacks);
      else if ("zubat".equals(player1)) Collections.addAll(player1Attacks, zubatAttacks);
      else if ("mankey".equals(player1)) Collections.addAll(player1Attacks, mankeyAttacks);
      // adds the names of the attacks to the player2's list according to the name of the pokemon they chose
      if ("pikachu".equals(player2)) Collections.addAll(player2Attacks, pikachuAttacks);
      else if ("charmander".equals(player2)) Collections.addAll(player2Attacks, charmanderAttacks);
      else if ("bulbasaur".equals(player2)) Collections.addAll(player2Attacks, bulbasaurAttacks);
      else if ("squirtle".equals(player2)) Collections.addAll(player2Attacks, squirtleAttacks);
      else if ("tepig".equals(player2)) Collections.addAll(player2Attacks, tepigAttacks);
      else if ("eevee".equals(player2)) Collections.addAll(player2Attacks, eeveeAttacks);
      else if ("zubat".equals(player2)) Collections.addAll(player2Attacks, zubatAttacks);
      else if ("mankey".equals(player2)) Collections.addAll(player2Attacks, mankeyAttacks);

      while(true){ // loops until one of the pokemon is a 0 hp
          System.out.println("-----------------------------------------------------------------");
          victor = getResult(hpPlayer1, hpPlayer2);
            if (victor != null) break;
          // player1's turn to attack
            System.out.println(player1 + " Attacks: \n" + player1Attacks + "\n ");
            String player1Attack = getPlayerAttack();  // gets player 1's attacks
            if (player1Attacks.contains(player1Attack)){
                System.out.println(player1Attack + " was used by " + player1 + "\n ");
                int attackDamagePositionPlayer1 = player1Attacks.indexOf(player1Attack);  // gets the index of the attack in the attacks list
                int attackDamagePlayer1 = Integer.parseInt(player1Attacks.get(attackDamagePositionPlayer1 + 1)); // gets the damage to the attack with the index + 1 of the name
                hpPlayer2 -= attackDamagePlayer1;  // if hit is successful damage is done and health is decreased
                System.out.println(attackDamagePlayer1 + " damage was done to " + player2 + "\n ");
                if (hpPlayer1 <= 0) hpPlayer1 = 0;  // zeros the hp if the hp drops below 0 or equals zero
                if (hpPlayer2 <= 0) hpPlayer2 = 0;
                System.out.println("Player 1 Health: " + hpPlayer1 + "\nPlayer 2 Health: " + hpPlayer2 + "\n ");
            }

            victor = getResult(hpPlayer1, hpPlayer2); // checks if any player won or not,
            if (victor != null) break;

            // player2's turn to attack // all if the stuff is the same as the player 1 except the variables.
          System.out.println(player2 + " Attacks: \n" + player2Attacks + "\n ");
            String player2Attack = getPlayerAttack();
            if (player2Attacks.contains(player2Attack)){
                System.out.println(player2Attack + " was used by " + player2 + "\n ");
                int attackDamagePositionPlayer2 = player2Attacks.indexOf(player2Attack);
                int attackDamagePlayer2 = Integer.parseInt(player2Attacks.get(attackDamagePositionPlayer2 + 1));
                hpPlayer1 -= attackDamagePlayer2;
                System.out.println(attackDamagePlayer2 + " damage was done to " + player1 + "\n ");
                if (hpPlayer1 <= 0) hpPlayer1 = 0;
                if (hpPlayer2 <= 0) hpPlayer2 = 0;
                System.out.println("Player 1 Health: " + hpPlayer1 + "\nPlayer 2 Health: " + hpPlayer2 + "\n ");
            }
        }
        victor = getResultPVP(hpPlayer1, hpPlayer2);
        if (victor.equals("player1")) victor = player1;
        else if (victor.equals("player2")) victor = player2;

        return victor;
      }

    public static String getResultPVP(int hp1, int hp2){  // Get results for the player vs player match.
      String victor;
      if (hp2 < 1 && hp1 > 0) victor = "player1";
      else if (hp2 > 0 && hp1 < 1) victor = "player2";
      else victor = null;
      return victor;
    }

    public static String pvcMatchStart(String player, String computer){  // player vs computer match // most of the code is the same as the pvp
        int hpPlayer = 2000;  // 400 for testing purposes
        int hpComputer = 2000; // 400 for testing purposes
        String victor;
        ArrayList<String> playerAttacks = new ArrayList<>();
        ArrayList<String> computerAttacks = new ArrayList<>();
        int stadiumNum = r.nextInt(7);
        hpPlayer = getFinalHealth(stadiumNum, player);
        hpComputer = getFinalHealth(stadiumNum, computer);
        System.out.println("-----------------------------------------------------------------\nStadium: " + stadiums[stadiumNum] + "\nHP1 " + player + ": " + hpPlayer + "\nHP2 " + computer + ": " + hpComputer);


        if ("pikachu".equals(player)) Collections.addAll(playerAttacks, pikachuAttacks);
        else if ("charmander".equals(player)) Collections.addAll(playerAttacks, charmanderAttacks);
        else if ("bulbasaur".equals(player)) Collections.addAll(playerAttacks, bulbasaurAttacks);
        else if ("squirtle".equals(player)) Collections.addAll(playerAttacks, squirtleAttacks);
        else if ("tepig".equals(player)) Collections.addAll(playerAttacks, tepigAttacks);
        else if ("eevee".equals(player)) Collections.addAll(playerAttacks, eeveeAttacks);
        else if ("zubat".equals(player)) Collections.addAll(playerAttacks, zubatAttacks);
        else if ("mankey".equals(player)) Collections.addAll(playerAttacks, mankeyAttacks);

        if ("pikachu".equals(computer)) Collections.addAll(computerAttacks, pikachuAttacks);
        else if ("charmander".equals(computer)) Collections.addAll(computerAttacks, charmanderAttacks);
        else if ("bulbasaur".equals(computer)) computerAttacks.addAll(Arrays.asList(bulbasaurAttacks));
        else if ("squirtle".equals(computer)) Collections.addAll(computerAttacks, squirtleAttacks);
        else if ("tepig".equals(computer)) Collections.addAll(computerAttacks, tepigAttacks);
        else if ("eevee".equals(computer)) Collections.addAll(computerAttacks, eeveeAttacks);
        else if ("zubat".equals(computer)) Collections.addAll(computerAttacks, zubatAttacks);
        else if ("mankey".equals(computer)) Collections.addAll(computerAttacks, mankeyAttacks);

        while(true){      //  loop while the healths of both pokemon are greater than 0
          System.out.println("-----------------------------------------------------------------");
            victor = getResult(hpPlayer, hpComputer);
            if (victor != null) break;

            // players turn to attack
            System.out.println(player + " Attacks: \n" + playerAttacks + "\n ");
            String playerAttack = getPlayerAttack();
            if (playerAttacks.contains(playerAttack)){
                System.out.println(playerAttack + " was used by " + player + "\n ");
                int attackDamagePositionPlayer = playerAttacks.indexOf(playerAttack);
                int attackDamagePlayer = Integer.parseInt(playerAttacks.get(attackDamagePositionPlayer + 1));
                hpComputer -= attackDamagePlayer;
                System.out.println(attackDamagePlayer + " damage was done to " + computer);
                if (hpComputer <= 0) hpComputer = 0;
                if (hpPlayer <= 0) hpPlayer = 0;
                System.out.println("Computer Health: " + hpComputer + "\nPlayer Health: " + hpPlayer + "\n ");
            }
            victor = getResult(hpPlayer, hpComputer);
            if (victor != null) break;

            // computer turn to attack
            String computerAttack = getComputerAttack(computer);
            if (playerAttacks.contains(playerAttack)){
                System.out.println(computerAttack + " was used by " + computer + "\n ");
                int attackDamagePositionComputer = computerAttacks.indexOf(computerAttack);
                int attackDamageComputer = Integer.parseInt(computerAttacks.get(attackDamagePositionComputer + 1));
                hpPlayer -= attackDamageComputer;
                System.out.println(attackDamageComputer + " damage was done to " + player);
                if (hpComputer <= 0) hpComputer = 0;
                if (hpPlayer <= 0) hpPlayer = 0;
                System.out.println("Computer Health: " + hpComputer + "\nPlayer Health: " + hpPlayer + "\n ");
            }
        }
        victor = getResult(hpPlayer, hpComputer);
        if (victor.equals("player")) victor = player;
        else if (victor.equals("computer")) victor = computer;

        return victor;
    }

  public static String getResult(int hp1,int hp2){  // Get results for the computer vs player match.
    String victor;
    if (hp2 < 1 && hp1 > 0) victor = "player";
    else if (hp2 > 0 && hp1 < 1)victor = "computer";
    else victor = null;
    return victor;
  }

    public static String getComputerAttack(String computer){  // Gets a random attack for the computer to use.
        String attack = null;
        if(computer.equals("pikachu")) attack = pikachuAttackCP[(r.nextInt(pikachuAttackCP.length))];
        else if(computer.equals("charmander")) attack = charmanderAttackCP[(r.nextInt(charmanderAttackCP.length))];
        else if(computer.equals("bulbasaur")) attack = bulbasaurAttackCP[(r.nextInt(bulbasaurAttackCP.length))];
        else if(computer.equals("squirtle")) attack = squirtleAttackCP[(r.nextInt(squirtleAttackCP.length))];
        else if(computer.equals("tepig")) attack = tepigAttackCP[(r.nextInt(tepigAttackCP.length))];
        else if(computer.equals("eevee")) attack = eeveeAttackCP[(r.nextInt(eeveeAttackCP.length))];
        else if(computer.equals("zubat")) attack = zubatAttackCP[(r.nextInt(zubatAttackCP.length))];
        else if(computer.equals("mankey")) attack = mankeyAttackCP[(r.nextInt(mankeyAttackCP.length))];
        return attack;
    }

    public static String getPlayerAttack(){ // Takes user input for the player's attack
        String attack;
        System.out.println("Player input an attack:");
        attack = sc.nextLine().toLowerCase();
        return attack;
    }

    public static void printPokemonStats(String x){ // prints the Pokemon stats based on which pokemon is chosen
      if (x.equals("pikachu")) System.out.println("Pikachu:  " + Arrays.toString(pikachuStats));
      else if (x.equals("charmander")) System.out.println("Charmander:  " + Arrays.toString(charmanderStats));
      else if (x.equals("squirtle")) System.out.println("Squirtle:  " + Arrays.toString(squirtleStats));
      else if (x.equals("bulbasaur")) System.out.println("Bulbasaur:  " + Arrays.toString(bulbasaurStats));
      else if (x.equals("eevee")) System.out.println("Eevee:  " + Arrays.toString(eeveeStats));
      else if (x.equals("tepig")) System.out.println("Tepig:  " + Arrays.toString(tepigStats));
      else if (x.equals("zubat")) System.out.println("Zubat:  " + Arrays.toString(zubatStats));
      else if (x.equals("mankey")) System.out.println("Mankey:  " + Arrays.toString(mankeyStats));
    }

    public static String getPlayerPokemon(){ // takes user input for players pokemon
        System.out.println("Please Choose a Pokemon");
        return sc.nextLine(); // xD
    }

    public static int getGameMode(){ // takes user input for the mode which the player want to play in
        System.out.println("Which mode would you like to play in\n1) Player vs Player\n2) Player vs Computer");
        return Integer.parseInt(sc.nextLine());
    }

    static String [] pokemons = {"pikachu", "charmander", "tepig", "squirtle", "eevee", "bulbasaur", "zubat", "mankey"}; // list of pokemon
    public static String getComputerPokemon() {return pokemons[r.nextInt(pokemons.length)];} // gets a random pokemon for the computer when player vs computer match is selected.
}