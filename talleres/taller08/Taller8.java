import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Integer> stack= new Stack <>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);
        Queue<String> queue= new LinkedList<String>();
        queue.add("Juan");
        queue.add("Maria");
        queue.add("Pedro");
       atender(queue);
       
    }
    
    public static void reverse (Stack<Integer> stack){
     for(int i=0; i<3; i++){
     stack.set(i, 0);
     }
     
     for(int i=3; i<0; i--){
     stack.push(i);
     }
     
    }
    
    public static void atender(Queue<String> q){
     for(int i=0; i<3; i++){
     System.out.println("Atendiendo a "+q.poll());
     }
    }
    
    
     
    }
