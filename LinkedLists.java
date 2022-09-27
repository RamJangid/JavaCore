import java.util.*;

public class LinkedLists 
{
    
    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> list1 = new LinkedList<>();


    
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

    System.out.println("Adding at first index by addFirst()");
    list.addFirst(5);

    System.out.println(list);

    System.out.println("Adding at last index by addLast()");
    list.addLast(111);

    System.out.println(list);

    System.out.println("Removing at first index by removeFirst()");
    list.removeFirst();

    System.out.println(list);

    System.out.println("Removing at last index by removeLast()");
    list.removeLast();

    System.out.println(list);

    //get elements

    int element1 = list.get(0);
    System.out.println(element1);

    //add element in between so use same add Fn in this way 

    list.add(1, 14);
    System.out.println(list);

    System.out.println("Adding a list to another list directly by addAll(list) Fn");
    list.addAll(list1); // will add in end index
    //list.addAll(0, list1);//Will add from 0th index

    //set elements means old replaced with new

    list.set(0, 4);//Set means replace element, not shifting
    System.out.println(list);

    //delete element by remove(index) method

    list.remove(0);
    System.out.println(list);

    //list.remove(10);//Direct Obj remove, taking index directly

    //list.removeAll(Collection);

    //size of ArrayList by size() method

    int size = list.size();
    System.out.println("Size of LinkedList "+size);

    System.out.println("Print LinkedList by loop");
    for(int i=0; i<list.size(); i++)
    {
        System.out.print(list.get(i)+" ");
    }
    System.out.println();

    //sorting
    Collections.sort(list);//will short in ascending order
    System.out.println(list);

    //list.addAll(Collection);

    boolean contains = list.contains(4);
    //list.containsAll(Collection);
    System.out.println(contains);

    //list.clear();
    //System.out.println(list);//[]

    //list.ensureCapacity(10); //This Fn not avail in LinkedList

    int index = list.indexOf(23);//return -1 if element not exists
    System.out.println(index);

    boolean isEmpty = list.isEmpty();
    System.out.println(isEmpty);

    System.out.println(list.lastIndexOf(23));

   List<Integer> subList = list.subList(1, 5);
   System.out.println(subList);

   System.out.println("Converting a LinkedList into Array");
   Object[] arr = list.toArray();
   for(int i=0; i<arr.length;i++)
   {
    System.out.print(arr[i]+" ");
   }
   System.out.println();

//    System.out.println(list.size());
//    list.trimToSize(); //This Fn not avail in LinkedList
//    System.out.println("After Trim "+list.size());


   System.out.println("Cloning the LinkedList");
   LinkedList<Integer> list2 = (LinkedList<Integer>) list.clone();
   System.out.println(list2);


        
    }
    
}
