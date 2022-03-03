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
        newQueue.getTail();
        newQueue.getHead();
    }
}
