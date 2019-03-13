package cyka.Character.Player.Classes;

import cyka.Character.Player.Player;
import cyka.Map.Location;


/**
 *
 * @author VincentE
 */
public class Priest extends Player{
    public Priest(String characterName,String Champ, Location currentLocation){
        super(characterName, "Priest", currentLocation);
                 
    }
    
    @Override
    public int gethealth(){
        return 75;
    }
    @Override
    public int getattackDamage(){
        return 75;
    }
    @Override
    public int getApples(){
        return 5;
    }
    @Override
    public String getChamp(){
        return "Priest";
    }
    
}     
   
    






















