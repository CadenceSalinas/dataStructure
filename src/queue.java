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
    private int size;

    //constructor
    public queue()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int newData)
    {
        tail = new Node(newData, tail);
    }

    public int getSize()
    {
        Node position = tail;
        while(position != null)
        {
            size++;
            position = position.getLink();
        }
        return size;
    }

    public void getHead()
    {
        Node position = tail;
        while(position != null)
        {
            head = position;
            position = position.getLink();
        }
        //head = tail.getNextNode();
        System.out.println(head.getData());
    }

    public void getTail()
    {
        //return tail.getData();
        System.out.println(tail.getData());
    }

    public void remove()
    {

        if(head != null)
        {
            head = null;
        }
        else {
            System.out.println("List is empty.");
            System.exit(0);
        }

//        for(int i = 0; i < size-2; i++)
//        {
//            head = tail.getNextNode();
//        }
//        int temp = tail.getData();
        for(int i = 0; i < size-1; i++)
        {
            tail = tail.getLink();
        }
//        tail = new Node(temp, tail);
    }

    public void showList()
    {
        Node position = tail;
        while(position != null)
        {
            System.out.print(position.getData() + " ");
            position = position.getLink();
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

        public Node getLink()
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
