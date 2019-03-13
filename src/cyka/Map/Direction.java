package cyka.Map;
/**
 *
 * @author VincentE
 */
public enum Direction {
    N("North"),
    S("South"),
    E("East"),
    W("West"),
    U("UP"),
    D("DOWN");
    //Sa("SAVE");
    
    
    public final String name;
    
    Direction(String name){
        this.name = name;
    }
}







