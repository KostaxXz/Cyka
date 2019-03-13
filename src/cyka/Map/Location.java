package cyka.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Location {

    final String Description;
    private final String storyText;
    private final Map<Direction,Location> exits = new HashMap<>();

    public Location(String Description, String storyText) {
        this.Description = Description;
        this.storyText = storyText;
    }
    
    public void addExit(Direction direction,Location location){
        exits.put(direction,location);
    }

    
    public Optional<Location> getNextLocation(Direction direction){
        return Optional.ofNullable(exits.get(direction));
    }
    
    public String description(){
        List<String> exit = exits.keySet().stream().map(dir -> dir.name).collect(Collectors.toList());
        
        return "\n" + Description+"\n" + storyText + "\nVisible exits: "+String.join(",",exit);
    }
    
    
    
    
    
    
    
}
















