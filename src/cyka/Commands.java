package cyka;

import cyka.Map.Direction;
import cyka.Character.Player.Player;

/**
 *
 * @author VincentE
 */
public class Commands {
    
    
    public static boolean command(boolean keepRunning, Player player, String command){
        switch(command) {
                case "quit game":
                case "exit game":
                    keepRunning = false;
                    break;
                case "n":
                case "north":
                    move(player,Direction.N);
                    break;
                case "s":
                case "south":
                    move(player,Direction.S);
                    break;
                case "e":
                case "east":
                    move(player,Direction.E);
                    break;
                case "w":
                case "west":
                    move(player,Direction.W);
                    break;
                case "stats":
                case "status":
                    System.out.println(player.status());
                    break;
                case "heal":
                case "apple":
                case "eat":
                    player.useApple();
                    break;
                case "help":
                    System.out.println("Use commands:\n  north(n),south(s),east(e),west(w) to move through exits.\n"
                            + "[other useful commands]:\n  status/stats (to see your stats)\n"
                            + "  heal,apple,eat (to heal yourself)\n"
                            + "  quit game/exit game (to quit the game)");
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
            return keepRunning;
        }
    
    private static void move(Player player, Direction direction){
        if(player.move(direction)){
                        System.out.println(player.getCurrentLocationDescription());
                        
                    } else {
                        System.out.println("there is no exit in this direction");
                    }
    }
    
}



























