// import java.util.*;

// public class LinkedListDone 
// {
//     public static void main(String[] args) 
//     {
//         LinkedList<String> list = new LinkedList<>();

//         LinkedList<String> list2 = new LinkedList<>();

//         //addFirst Fn
//         list.addFirst("a");
//         list.addFirst("is");
//         list.addFirst("This");
//         System.out.println(list);

//         //addLast or add is same 

//         list.addLast("list");
//         System.out.println(list);

//         list.add("add Fn");
//         System.out.println(list);

//         //size Fn

//         int size = list.size();
//         System.out.println("Size of LinkedList is "+size);

//         for(int i=0; i<list.size(); i++)
//         {
//             System.out.print(list.get(i)+" -> ");
//         }
//         System.out.println("null");

//         //deleteFirst 

//         //list.deleteFirst(); not this one, use removeFirst and removeLast

//         list.removeFirst();
//         System.out.println(list);

//         list.removeLast();
//         System.out.println(list);

//         list.remove(1); //index
//         System.out.println(list);

//         //add in between

//         list.add(1, "a");
//         System.out.println(list);

//         System.out.println("Reversing the list and assigning into a new list");

//         for(int i=list.size()-1, j=0; i>=0 && j<list.size(); i--, j++)
//         {
//             list2.add(j, list.get(i));
//         }

//         System.out.println("Sorted list");

//         System.out.println(list2);


        
//     }

    
// }


public class LinkedListDone 
{
    Node head;

    class Node
    {
        String data;
        Node next; //next means next Node

        public Node(String data) // String type data will be stored
        {
            this.data = data;
            this.next = null;
        }
    }

    //add First 

    public void addFirst(String data) 
    {
        Node newNode = new Node(data);

        if(head==null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add Last

    public void addLast(String data) 
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;

        //Also we are checking in while that next node me null nhi h jab tak hi loop chalao, jese hi next Node me null h to bahar aao or currNode.next me newNode add krdo
        while (currNode.next != null) // Yehi to baat h yr, you should check for next, it should not have null then only you will assign next into currNode
        {
            currNode = currNode.next;

        }

        currNode.next = newNode;
        
    }

    //print the list Done

    public void printList() 
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;

        while(currNode != null)
        {
            System.out.print(currNode.data+" -> ");

            currNode = currNode.next;
        }

        System.out.println("Null");
        
    }

    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }

        head = head.next;
    }

    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }

        if(head.next == null)
        {
            head = null; //one element is thr suppose [a] -> null so if we delete a then null will be the only so head will ne shifted to null
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    //Reverse the LinkedList by Iterative method

    public void reverseIterate()
    {
        if(head == null || head.next == null)
        {
            return;
        }

        Node PrevNode = head;
        Node currNode = head.next;

        while(currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = PrevNode;


            //Update

            PrevNode = currNode;
            currNode = nextNode;

        }

        head.next = null;
        head = PrevNode;



    }



    public static void main(String[] args) 
    {

        LinkedListDone list = new LinkedListDone();

        list.addFirst("a");
        list.addFirst("is");

        list.printList();
        
      
        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.reverseIterate();
        list.printList();
        
    }
    
}
