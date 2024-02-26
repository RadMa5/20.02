import java.util.ArrayList;
import java.util.random.*;

public class WheelOfFortune{

    private ArrayList<Toy> wheel;
    private int chanceCount;

    public WheelOfFortune(){
        wheel = new ArrayList<>();
    }
    
    public void Add(Toy toy){
        wheel.add(toy);
    }

    public void Test(){
        for(Toy toy : wheel){
            System.out.println(toy);
        }
    }
}
