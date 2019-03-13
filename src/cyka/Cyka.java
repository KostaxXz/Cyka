package cyka;

import cyka.Map.Maps;
import cyka.Character.Player.Player;
import java.util.Scanner;

/**
 *
 * @author VincentE
 */
public class Cyka {

    public static void main(String[] args) {
        Scanner readname = new Scanner(System.in);
        System.out.println("Please enter your character's name: ");  //Onoma paikth
        String username = readname.nextLine();
        boolean keepRunning = true;
        
    loop:
        while(keepRunning){   
        Scanner readChamp = new Scanner(System.in);
        System.out.println("Please Choose your Champion: 1.Warrior - 2.Hunter - 3.Priest"); //To class tou paikth
        String champion = readChamp.nextLine();

        Maps.makeMap();  //ftiaxnei to Map
        
        Player player = new Player(username, champion, Maps.getStartLoc()); //ftiaxnei to object tou paikth
        
        if("Warrior".equals(player.getChamp()) ||           //elegxos gia ta swsth epilogh champion
           "Hunter".equals(player.getChamp()) ||            //exei kalutero tropo alla dn ton vrika akoma)
           "Priest".equals(player.getChamp())){ 
                                                                                                                             
                System.out.println("\n" + player.status());  //deixnei ta stoixeia tou paixth
                System.out.println(player.getCurrentLocationDescription());     //deixnei tin topothesia
        
                Scanner scanner = new Scanner(System.in);
            
                while(keepRunning){                  //dexetai tis entoles pou vazei o xrhsths gia na kounithei(commands class)
                    String line = scanner.nextLine();
                    keepRunning = Commands.command(keepRunning, player, line); 
                }
            
                scanner.close();
            }else{
                System.out.println("Please insert a correct champ");
                continue loop;
            }
        }
    }
    
}





















































