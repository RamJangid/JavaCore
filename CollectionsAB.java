import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionsAB
{
    public static void main(String[] args) 
    {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(21);
        adq.offer(14);
        adq.offer(7);
        adq.offer(25);

        System.out.println(adq);// Normal order same as inserted, not PriorityQueue

        adq.offerFirst(1);//If you write Queue<> -> ArrayDeque then offerFast() ... Fn not come
        adq.offerLast(23);

        System.out.println(adq);

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        
    }
}


// import java.util.Collections;
// import java.util.Comparator;
// import java.util.PriorityQueue;
// import java.util.Queue;

// public class CollectionsAB
// {
//     public static void main(String[] args) 
//     {
//         Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.offer(21);
//         pq.offer(14);
//         pq.offer(7);
//         pq.offer(25);

//         System.out.println(pq);

//         pq.poll();

//         System.out.println(pq);

//         System.out.println(pq.peek());

//         System.out.println("Checking other function in PriorityQueue, same as Queue");
        
//         //Collections.sort(pq);
//         System.out.println(pq);
//     }
// }





// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

// public class CollectionsAB 
// {
//     public static void main(String[] args) 
//     {
//         Queue<Integer> queue = new LinkedList<>();

//         queue.offer(10);
//         queue.offer(11);
//         queue.offer(14);
//         queue.offer(21);
//         queue.offer(22);
//         queue.offer(23);
//         queue.offer(25);

//         System.out.println(queue);

//         System.out.println(queue.poll());

//         System.out.println(queue);

//         //System.out.println(queue.pollFirst()); Or pollLast() both are not avail

//         System.out.println(queue.peek());

//         //System.out.println(queue.peekFirst()); Or peekLast() both are not avail

//         System.out.println("Contain an element "+queue.contains(25));

//         System.out.println("Hash Code of LinkedList queue "+queue.hashCode());

//         System.out.println("Is Empty "+queue.isEmpty());

//         System.out.println("Size means how many elements are there at the moment"+queue.size());

//         System.out.println("Get Class Fn "+queue.getClass());

//         //System.out.println(queue.stream());

//         //queue.toArray();

//         //queue.clear();


        
//     }
    
//}
