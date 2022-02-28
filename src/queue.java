/*
First in, first out - insert at end remove at beginning
Includes insert, delete, looking
    - able to insert at tail and delete at head


*/

public class queue
{
    //variables
    private Node head;

    //constructor
    public queue()
    {
        head = null;
    }

    public void add(int newData)
    {
        head = new Node(newData, head);
    }

    public void showList()
    {
        Node position = head;
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
