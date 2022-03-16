public class queueDriver {
    public static void main(String[] args)
    {
        queue newQueue = new queue();
        newQueue.add(5);
        newQueue.add(6);
        newQueue.showList();
        System.out.println();
        newQueue.add(7);
        System.out.println();
        newQueue.showList();
        System.out.println();
        System.out.println("\nThe list size is: " + newQueue.getSize());
        System.out.println("The tail: " + newQueue.getTail());
        System.out.println();
        System.out.println("The head: " + newQueue.getHead());
        System.out.println();
        newQueue.remove();
        System.out.println("The list: ");
        newQueue.showList();
        System.out.println("The head: ");
        newQueue.getHead();
    }
}
