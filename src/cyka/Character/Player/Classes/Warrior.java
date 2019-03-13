package cyka.Character.Player.Classes;

import cyka.Character.Player.Player;
import cyka.Map.Location;


/**
 *
 * @author VincentE
 */
public class Warrior extends Player{
    public Warrior(String characterName,String Champ, Location currentLocation){
        super(characterName, Champ, currentLocation);
                    
    }
    
    @Override
    public int gethealth(){
        return 150;
    }
    @Override
    public int getattackDamage(){
        return 50;
    }
    @Override
    public int getApples(){
        return 2;
    }
    @Override
    public String getChamp(){
        return "Warrior";
    }
    
}     
   
    






















