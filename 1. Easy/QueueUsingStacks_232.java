public class QueueUsingStacks_232 {
   
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

     public MyQueue() {
         stack1 = new LinkedList<>();
         stack2 = new LinkedList<>(); 
    }
    
    public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.addFirst(stack1.removeFirst());
        }
        stack1.addFirst(x);

        while (!stack2.isEmpty()) {
            stack1.addFirst(stack2.removeFirst());
        }
        
    }
    
    public int pop() {

        return stack1.removeFirst();
        
    }
    
    public int peek() {

        return stack1.getFirst();
        
    }
    
    public boolean empty() {

        return stack1.isEmpty();
        
    }
}