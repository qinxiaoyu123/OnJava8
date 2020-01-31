package collections;

public class StackCollision {
    public static void main(String []args){
        collections.Stack<String> stack = new collections.Stack<>();
        for(String s: "My dos has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        java.util.Stack stack1 = new java.util.Stack();
        for(String s: "My dos has fleas".split(" ")){
            stack1.push(s);
        }
        while(!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }
}
