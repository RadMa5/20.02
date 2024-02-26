public class Toy{
    private int id;
    private String name;
    private int amount;
    private int chance;

    public Toy(int id, String name, int amount, int chance){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.chance = chance;
    }

    public void setChance(int chance){
        this.chance = chance;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

    public int getChance(){
        return chance;
    }

    @Override
    public String toString(){
        return id + ". " + name + " " + amount + " " + chance;
    }
}