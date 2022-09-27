class Polymor 
{
    String name;
    int age;

    public void printInfo(String name)
    {
        System.out.println(name);
    }

    public void printInfo(int age)
    {
        System.out.println(age);
    }

    public void printInfo(String name, int age)
    {
        System.out.println(name+" "+age);
    }


}

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        Polymor s1 = new Polymor();
        s1.name = "Tony Stark";
        s1.age = 21;

        //s1.printInfo(s1.age);
        //s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);

    }
    
}
