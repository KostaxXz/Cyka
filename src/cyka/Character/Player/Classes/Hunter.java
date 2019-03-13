package cyka.Character.Player.Classes;

import cyka.Character.Player.Player;
import cyka.Map.Location;


/**
 *
 * @author VincentE
 */
public class Hunter extends Player{
    public Hunter(String characterName,String Champ, Location currentLocation){
        super(characterName, Champ, currentLocation);
                 
    }
    @Override
    public int gethealth(){
        return 100;
    }
    @Override
    public int getattackDamage(){
        return 90;
    }
    @Override
    public int getApples(){
        return 2;
    }
    
    @Override
    public String getChamp(){
        return "Hunter";
    }

}     
   
    





















