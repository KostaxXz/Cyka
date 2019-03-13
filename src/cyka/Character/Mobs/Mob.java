package cyka.Character.Mobs;

import cyka.Character.Mobs.Enemies.Giant_Rat;
import cyka.Character.Mobs.Enemies.Goblin;
import cyka.Character.Mobs.Enemies.Rat;
import cyka.Map.Location;
import cyka.character;

/**
 *
 * @author VincentE
 */
public class Mob extends character{
    public Mob(String Champ){
     super("",Champ);
     setChamp(randomChamp());
     Stats();
     this.curhealth = health;
    }
    
    public String randomChamp(){
        String[] champs = {"Rat", "Giant Rat", "Goblin"};
        int index = (int)(Math.random() * champs.length);
        return champs[index];
    }
    
    public void spawnMob(Mob Champ,Location location ){
        {
            Mob mob = new Mob(Mob.Champ);{
            System.out.println("A" + mob + "appeared!!");
            }
        }   
    }
    
    public void Stats(){
        switch(randomChamp()){
            case "Rat":
                Rat rat = new Rat();
                Champ = rat.getChamp();
                health = rat.gethealth();
                attackDamage = rat.getattackDamage();
                break;
            case "Giant Rat":
                Giant_Rat giant_rat = new Giant_Rat();
                health = giant_rat.gethealth();
                attackDamage = giant_rat.getattackDamage();
                break;
            case "Goblin":
                    Goblin goblin = new Goblin();
                    health = goblin.gethealth();
                    attackDamage = goblin.getattackDamage();
                    break;
        }
    }
}










