import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsABSet 
{
    public static void main(String[] args) 
    {

        Set<StudentDone> studentDone = new HashSet<>();

        studentDone.add(new StudentDone("Anuj", 2));
        studentDone.add(new StudentDone("Ram", 4));
        studentDone.add(new StudentDone("Krish", 3));

        studentDone.add(new StudentDone("Sagar", 2));//same roll no but Hash can't identify

        System.out.println(studentDone);







        // //Set<Integer> set = new HashSet<>();
        // //Set<Integer> linkedSet = new LinkedHashSet<>();
        // Set<Integer> treeSet = new TreeSet<>();

        // treeSet.add(21);
        // treeSet.add(23);
        // treeSet.add(5);
        // treeSet.add(7);
        // treeSet.add(4);

        // System.out.println(treeSet);

        // treeSet.add(21);//duplicate element, no err but not added
        // System.out.println(treeSet);

        // treeSet.remove(23);

        // System.out.println(treeSet);
        
        // System.out.println(treeSet.contains(21));
        // System.out.println(treeSet.isEmpty());
        // System.out.println(treeSet.size());

        // treeSet.clear();
        // System.out.println(treeSet);
        
    }
    
}
