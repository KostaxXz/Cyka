package cyka.Map;

/**
 *
 * @author VincentE
 */
public class Maps {
    
    public static Location startLoc;
    public String roomLocation;
    
    public static Location getStartLoc(){
        return startLoc;
    }
    
    public static void makeMap(){
        Location location1 = new Location("-First room: Bedroom","-I need to get out of this house\n");
        Location location2 = new Location("-Second room: Living Room","-Where the fuck am I?\n");
        Location location3 = new Location("-Third room: Hallway","-Where is the exit, i want to leave asap..\n");
        Location location4 = new Location("-Fourth room: Kitchen","-I'm so hungry... Good thing i've got these apples\n");
        Location location5 = new Location("-Fifth room: Bathroom","-I dont think im going the right way...\n");
        Location location6 = new Location("-Sixth room: Guest Room","-I think im getting close to the exit.\n");
        Location location7 = new Location("-Seventh room: Bathroom","-Finally the exit door!!!.\n");
        Location location8 = new Location("-Congratulations!!!","-You made it out of the house!!");
        
        startLoc = location1;

        location1.addExit(Direction.N, location2);
        
        location2.addExit(Direction.S, location1);
        location2.addExit(Direction.E, location3);
        
        location3.addExit(Direction.W, location2);
        location3.addExit(Direction.N, location4);
        
        location4.addExit(Direction.S, location3);
        location4.addExit(Direction.W, location5);
        location4.addExit(Direction.E, location6);
        
        location5.addExit(Direction.E, location4);
        
        location6.addExit(Direction.W, location4);
        location6.addExit(Direction.E, location7);
        
        location7.addExit(Direction.W, location6);
        location7.addExit(Direction.N, location8);
    
    }
}











