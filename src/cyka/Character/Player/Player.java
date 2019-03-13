package cyka.Character.Player;

import cyka.Character.Player.Classes.Priest;
import cyka.Character.Player.Classes.Warrior;
import cyka.Character.Player.Classes.Hunter;
import cyka.Map.Direction;
import cyka.Map.Location;
import cyka.character;
import java.util.Optional;


/**
 *
 * @author VincentE
 */
public class Player extends character {
     public int apples;
     public Location currentLocation;
     
     
     public Player(String characterName, String Champ, Location currentLocation){
        super(characterName, Champ);
        this.currentLocation = currentLocation;
        stats();
        this.curhealth = health;
    } 
     
     
     
     public String useApple(){
         if(apples >=1 ){
             this.setcurHealth(this.getcurhealth() + 25);
             apples--;
             System.out.println("You ate an apple!");
             return apples + " apples left.";
         }else{
             System.out.println("You dont have any apples left");
             return "You dont have any apples left.";
         }
     }
     public int getApples(){
         return apples;
     }
     public void setApples(){
         this.apples = apples;
     }
     
     public void stats(){
                switch(Champ){
                case "warrior":
                case "w":
                case "1":
                    Warrior war = new Warrior(characterName,"Warrior",currentLocation);
                    Champ = war.getChamp();
                    health = war.gethealth();
                    attackDamage = war.getattackDamage();
                    apples = war.getApples();
                    break;
                case "hunter":
                case "h":
                case "2":
                    Hunter hun = new Hunter(characterName,"Hunter", currentLocation);
                    Champ = hun.getChamp();
                    health = hun.gethealth();
                    attackDamage = hun.getattackDamage();
                    apples = hun.getApples();
                    break;
                case "priest":
                case "p":
                case "3":
                    Priest pri = new Priest(characterName,"Priest",currentLocation);
                    Champ = pri.getChamp();
                    health = pri.gethealth();
                    attackDamage = pri.getattackDamage();
                    apples = pri.getApples();
                    break;
         }
                
       }
     
     public String status(){
        return "*" + characterName + " has " + curhealth + " / " + health + " health. " + apples + " apples left. " + "(" + attackDamage + " max Attack Damage.)*";
    }

     public boolean move(Direction direction) {
        boolean moved = false;
        Optional<Location> next = this.currentLocation.getNextLocation(direction);
        if(next.isPresent()){
            this.currentLocation = next.get();
            moved = true;
        }
         return moved;  
    }
    
    public String getCurrentLocationDescription(){
        return this.currentLocation.description();
    }
   
    
   
}













