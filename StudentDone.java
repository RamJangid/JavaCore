import java.util.Objects;

public class StudentDone implements Comparable<StudentDone>
{
    String name;
    int rollNo;

    public StudentDone(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() 
    {
        return "StudentDone {name=" + name + ", rollNo=" + rollNo + "}";
    }

    @Override
    public int hashCode() 
    {

        return Objects.hash(rollNo);
        // final int prime = 31;
        // int result = 1;
        // result = prime * result + rollNo;
        // return result;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        StudentDone student = (StudentDone) obj;
        if (rollNo != student.rollNo)
            return false;
            
        //return true; or

        return rollNo == student.rollNo;
    }

    @Override
    public int compareTo(StudentDone that) 
    {
        return this.rollNo - that.rollNo;//Or  by name also

        //return this.name.compareTo(that.name);
    }

   

    

    
    

   
    
    
}
