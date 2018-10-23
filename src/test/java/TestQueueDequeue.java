import cbu527.com.list.QueueDequeueMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQueueDequeue {

    @Test
    public void testQueueDequeue(){

        QueueDequeueMethods queue = new QueueDequeueMethods();

        //Test of add the elements in queue.
        queue.addItem(6);
        queue.addItem(7);
        queue.addItem(8);
        Assertions.assertEquals(5,queue.count());

        //Test of remove the element in queue.
        queue.remove(2);
        Assertions.assertEquals(6,queue.count());

        //Test of add element at particular index
        queue.addItem(1,3);
        queue.addItem(4,3);
        Assertions.assertEquals(4,queue.count());

        //Test of the size of the queue
        Assertions.assertEquals(5,queue.count());

    }
}
