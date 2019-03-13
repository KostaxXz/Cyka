package cyka.Character.Mobs.Enemies;

import cyka.Character.Mobs.Mob;



/**
 *
 * @author VincentE
 */
public class Rat extends Mob{
    public Rat(){
       super("Rat");
    }
        
    @Override
    public int gethealth(){
       
       return health = 30;
    }
    @Override
    public int getattackDamage(){
        
        return attackDamage = 15;
    }
    
    
}








