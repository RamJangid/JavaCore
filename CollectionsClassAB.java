import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class CollectionsClassAB
{
    public static void main(String[] args) 
    {
        List<StudentDone> list = new ArrayList<>();

        list.add(new StudentDone("Anuj", 2));
        list.add(new StudentDone("Ram", 4));
        list.add(new StudentDone("Sagar", 3));
        list.add(new StudentDone("Anuj", 1));

        System.out.println(list);


        //Collections.sort(list); Err as Student do not implements Comparator

        Collections.sort(list, new Comparator<StudentDone>()
        {

            @Override
            public int compare(StudentDone o1, StudentDone o2) 
            {
                
                return o1.name.compareTo(o2.name);
            }
            
        });

        System.out.println(list);

        






        // list.add(21);
        // list.add(11);
        // list.add(5);
        // list.add(14);
        // list.add(23);



        // System.out.println(Collections.min(list));
        // System.out.println(Collections.max(list));

        // Collections.sort(list, Comparator.reverseOrder());

        // System.out.println(list);

        



        
    }
    
}
