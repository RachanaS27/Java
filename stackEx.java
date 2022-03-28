import java.util.Stack;

public class stackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(41);
        stack.push(121);
        stack.push(114);
        stack.push(61);
        stack.push(14);
        stack.push(61);
        stack.push(181);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.firstElement());
        System.out.println(stack.lastIndexOf(61));
        System.out.println(stack.lastElement());
        System.out.println(stack.get(3));
        System.out.println(stack.contains(121));

    }
}
