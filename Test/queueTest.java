import org.junit.Test;

import static org.junit.Assert.*;

public class queueTest {

    @Test
    public void listLength()
    {
        queue tester1 = new queue();
        //tester1.add(1);
        assertEquals(0, tester1.getSize());
    }

    @Test
    public void listLength2()
    {
        queue tester1 = new queue();
        tester1.add(1);
        tester1.add(2);
        tester1.add(4);
        tester1.remove();
        assertEquals(2, tester1.getSize());
    }

    @Test
    public void getTail()
    {
        queue tester1 = new queue();
        tester1.add(1);
        tester1.add(2);
        tester1.add(4);
        assertEquals(4, tester1.getTail());
    }

    @Test
    public void getHead()
    {
        queue tester1 = new queue();
        tester1.add(1);
        tester1.add(2);
        tester1.add(4);
        assertEquals(1, tester1.getHead());
    }

    @Test
    public void listLength1GetHead()
    {
        queue tester1 = new queue();
        tester1.add(10);
        assertEquals(10, tester1.getHead());
    }

    @Test
    public void listLength1GetTail()
    {
        queue tester1 = new queue();
        tester1.add(29482);
        assertEquals(29482, tester1.getTail());
    }

    @Test
    public void getData()
    {
        queue tester1 = new queue();
        tester1.add(1);
        tester1.add(2);
        tester1.add(4);
        assertEquals(2, tester1.data(1));
    }
}