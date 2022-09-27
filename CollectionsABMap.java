import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsABMap 
{
    public static void main(String[] args) 
    {
        //Map<String, Integer> numbers = new HashMap<>();

        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 7);
        numbers.put("Three", 4);
        numbers.put("Four", 5);
        numbers.put("Five", 10);

        numbers.put("Two", 11);//Duplicate value no err but do not add, Override old value

        System.out.println(numbers);//HashMap means random order

        if(!numbers.containsKey("One"))
        {
            numbers.put("One", 14);

        }

        System.out.println(numbers);

        numbers.putIfAbsent("Seven", 21);

        System.out.println(numbers);

        System.out.println(numbers.containsKey("One"));
        System.out.println(numbers.containsValue(21));

        numbers.remove("Seven");
        System.out.println(numbers);

        for(Map.Entry<String, Integer> e : numbers.entrySet())
        {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String keys : numbers.keySet())
        {
            System.out.println(keys);
        }

        for(Integer values : numbers.values())
        {
            System.out.println(values);
        }

        
    }
    
}
