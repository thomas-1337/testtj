public class MyStackMain {
    public static void main(String[] args) {
        StackLike stack = new MyStack();

        stack.push(12);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        System.out.println(stack);
        System.out.println("is empty?: " + stack.isEmpty());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("is empty?: " + stack.isEmpty());
    }
}
