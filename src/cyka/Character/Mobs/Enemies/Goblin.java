package cyka.Character.Mobs.Enemies;

import cyka.Character.Mobs.Mob;

/**
 *
 * @author VincentE
 */
public class Goblin extends Mob{
    public Goblin(){
       super("Goblin");
    }
        
    @Override
    public int gethealth(){
       
       return health = 80;
    }
    @Override
    public int getattackDamage(){
        
        return attackDamage = 30;
    }
    
    
}








