import java.util.ArrayList;
import java.util.Random;

public class WheelOfFortune{

    private ArrayList<Toy> wheel;
    private int chanceCount;
    private ArrayList<Integer> table = new ArrayList<>();
    private ArrayList<Toy> winners = new ArrayList<>();

    public WheelOfFortune(){
        wheel = new ArrayList<>();
    }
    
    public void Add(Toy toy){
        wheel.add(toy);
        chanceCount += toy.getChance();
    }


    public void SpinTheWheel(int amountOfSpins){
        if(chanceCount != 100){
            System.out.println("The sum of all chances is not equal to 100.");
        } else{
            for(Toy toy: wheel){
                for(int i = 0; i < toy.getChance(); i++){
                    table.add(toy.getId());
                }
            }

            for(int i = 0; i < amountOfSpins; i++){
                Random rng = new Random();
                int win = rng.nextInt(100);
                int idWinner = table.get(win);
                for(Toy toy: wheel){
                    if(idWinner == toy.getId()){
                        winners.add(toy);
                        System.out.println(toy);
                    }
                }
            }
        }
    }
}
