import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        stack.push("minecraft");
        stack.push("skyrim");
        stack.push("doom");
        stack.push("borderlands");
        stack.push("FFVII");
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search("minecraft"));
        String favGame = stack.pop();
        System.out.println(favGame);
    }
}
