package EdyodaPractice.DSA.Assignments;
import java.util.*;

public class ReverseStack
{
    public static <T> void reverseStack(Stack<T> stack)

    {
        if(stack.isEmpty())
        {
            return;
        }
        T bottom=popBottom(stack);
        reverseStack(stack);
        stack.push(bottom);
    }
    private static <T> T popBottom(Stack<T> stack)
    {
        T top=stack.pop();
        if(stack.isEmpty()) {
            return top;
        }
            else
            {
               T bottom=popBottom(stack);
               stack.push(top);
               return bottom;
            }
    }
    private static <T>void printStack(Stack<T>stack)
    {
        Iterator<T>iterator=stack.iterator();
        while (iterator.hasNext())
        {
            T t=(T)iterator.next();
            System.out.println(t);
        }
    }

    public static void main(String[] args)
    {
        Stack<Integer>stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack elements before reverse");
        printStack(stack);
        ReverseStack reversal = new ReverseStack();
        reversal.reverseStack(stack);

        System.out.println("Stack after before reverse");
        printStack(stack);


    }
}
