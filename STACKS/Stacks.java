import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element before pop:"+stack.peek());


        System.out.println("pop element is:"+stack.pop());

        System.out.println("Top element after pop:"+stack.peek());

        System.out.println("stack size is:"+stack.size());

        System.out.println("check is it empty:"+stack.isEmpty());
 
        System.out.println("stack elements are:"+stack);       
        
    }
}
