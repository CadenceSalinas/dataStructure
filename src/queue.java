/*
First in, first out - insert at end remove at beginning
Includes insert, delete, looking
    - able to insert at tail and delete at head


*/

public class queue
{
    //variables
    private Node head;
    private Node tail;

    //constructor
    public queue()
    {
        head = null;
        tail = null;
    }

    public void add(int newData)
    {
        tail = new Node(newData, tail);
    }

    public void remove()
    {
        if(head != null)
        {
            head = head.getNextNode();
        }
        else
        {
            System.out.println("You're deleting from an empty list.");
            System.exit(0);
        }
    }

    public void showList()
    {
        Node position = tail;
        while(position != null)
        {
            System.out.println(position.getData());
            position = position.getNextNode();
        }
    }

    private class Node
    {
        public int data;
        private Node link;

        //constructor
        public Node(int data, Node next)
        {
            this.data = data;
            this.link = next;
        }

        public void setNextNode(Node node)
        {
            this.link = node;
        }

        public Node getNextNode()
        {
            return this.link;
        }

        public int getData()
        {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", link=" + link +
                    '}';
        }
    }//end node
}//end queue
