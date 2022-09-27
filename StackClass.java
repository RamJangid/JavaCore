import java.util.Collections;
import java.util.Stack;

public class StackClass 
{

    public static void pushAtBottom(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);


    }
    public static void main(String[] args) 
    {

        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(7);
        stk.push(5);

        System.out.println("Before Collections.sort()");
        System.out.println(stk);

        System.out.println("After Collections.sort()");
        Collections.sort(stk);
        System.out.println(stk);
        

        //System.out.println(stk);// [11, 14, 7, 4]

        pushAtBottom(4, stk);

        while(!stk.isEmpty())
        {
            System.out.println(stk.peek());
            stk.pop();
        }

      
        
    }
    
}
