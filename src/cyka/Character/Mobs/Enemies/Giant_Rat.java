package cyka.Character.Mobs.Enemies;

import cyka.Character.Mobs.Mob;

/**
 *
 * @author VincentE
 */
public class Giant_Rat extends Mob{
    public Giant_Rat(){
       super("Giant Rat");
    }
        
    @Override
    public int gethealth(){
       
       return health=50;
    }
    @Override
    public int getattackDamage(){
        
        return attackDamage = 20;
    }
    
    
}









