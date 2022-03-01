public class queueDriver {
    public static void main(String[] args)
    {
        queue newQueue = new queue();
        newQueue.add(5);
        newQueue.add(6);
        newQueue.showList();
        newQueue.add(7);
        newQueue.remove();
        newQueue.showList();
    }
}
