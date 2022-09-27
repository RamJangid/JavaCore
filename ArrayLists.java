import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ArrayLists
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<>(10);

        list1.add(51);
        list1.add(101);
        
        //Add elements

        list.add(10);
        list.add(11);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(25);
        list.add(28);


        System.out.println(list);

        //get elements

        int element1 = list.get(0);
        System.out.println(element1);

        //add element in between so use same add Fn in this way 

        list.add(1, 14);
        System.out.println(list);

        System.out.println("Adding a ArrayList to another ArrayList directly by addAll(list) Fn");
        list.addAll(list1); // will add in end index
        //list.addAll(0, list1);//Will add from 0th index

        //set elements means old replaced with new

        list.set(0, 4);//Set means replace element, not shifting
        System.out.println(list);

        //delete element by remove(index) method

        list.remove(0);
        System.out.println(list);

        System.out.println("removing by obj");
        list.remove(Integer.valueOf(28));//Direct Obj remove, taking index directly
        System.out.println(list);

        //list.removeAll(Collection);

        //size of ArrayList by size() method

        int size = list.size();
        System.out.println("Size of ArrayList "+size);

        System.out.println("Print ArrayList by loop");
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        System.out.println("Print ArrayList by For Each loop");

        for(Integer element : list)
        {
            System.out.println(element);
        }

        System.out.println("Print ArrayList by Iterator");
      
        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //sorting
        Collections.sort(list);//will short in ascending order
        System.out.println(list);

        //list.addAll(Collection);

        boolean contains = list.contains(4);
        //list.containsAll(Collection);
        System.out.println(contains);

        //list.clear();
        //System.out.println(list);//[]

        list.ensureCapacity(10);

        int index = list.indexOf(23);//return -1 if element not exists
        System.out.println(index);

        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);

        System.out.println(list.lastIndexOf(23));

       List<Integer> subList = list.subList(1, 5);
       System.out.println(subList);

       System.out.println("Converting a ArrayList into Array");
       Object[] arr = list.toArray();
       for(int i=0; i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }

       System.out.println(list.size());
       list.trimToSize();
       System.out.println("After Trim "+list.size());


       System.out.println("Cloning the ArrayList");
       ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
       System.out.println(list2);



    
    }

}
