class NewStudent
{
    String name;
    static String school;

    public static void changeSchool() 
    {
        school = "NewSchool";// do not need to use static here
        
    }
}

public class StaticKeywd 
{
    public static void main(String[] args) 
    {
        NewStudent.school = "ABC";
        System.out.println(NewStudent.school);

        NewStudent s1 = new NewStudent();
        s1.name = "Tony";
        System.out.println(s1.name);
        
    }

    
}
