import bank.Bank;

class Pen 
{
    String color; //class member 
    String type;

    public void write()
    {
        System.out.println("Write something, color and type is here");
    }

    public void printColor()
    {
        System.out.println(this.color);// current obj me jo h wo print krega
    }
}

class Student 
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // public Student(String name, int age)
    // {
    //     System.out.println("Paramtr Constrctr");
    //     this.name = name;
    //     this.age = age;
    // }

    public Student()
    {
        System.out.println("Non-Paramtr constr");
    }

    public Student(Student s)
    {
        this.name = s.name;
        this.age = s.age;

    }



}


public class OOPS 
{
    public static void main(String[] args) 
    {
        // Pen pen1 = new Pen();
        // pen1.write();

        // pen1.color = "Blue";
        // pen1.type = "Gel";

        // pen1.printColor();

        // Pen pen2 = new Pen();
        // pen2.write();

        // pen2.color = "Black";
        // pen2.type = "Ballpoint";

        // pen2.printColor();

        //Student std1 = new Student("Tony Stark", 21);// Constrctr calls first
        // std1.name = "Tony Stark";
        // std1.age = 21;

        //std1.printInfo();

        Student s1 = new Student();

        s1.name = "Tony Stark";
        s1.age = 21;
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();


       
        Bank account1 = new Bank();
        account1.name = "Tony Stark";

        System.out.println(account1.name);



        
    }
    
}
