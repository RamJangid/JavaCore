interface NewAnimal
{
    // NewAnimal() can not create any Constructor in interface
    // {

    // }
    int eye = 2;// public static final By Default
    void walk();// public abstract By Default
}

interface Herbivores
{
    void onlyPlantEating();
}

class NewHorse implements NewAnimal, Herbivores
{
    public void walk()
    {
        System.out.println("Walk Fn in NewHorse class");
    }

    public void onlyPlantEating()
    {
        System.out.println("Only Eat the plants");
    }
}
 
public class Interfaces 
{
    public static void main(String[] args) 
    {
        NewHorse obj = new NewHorse();
        obj.walk();
        obj.onlyPlantEating();

        
    }


    
}
