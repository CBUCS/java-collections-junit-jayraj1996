import cbu527.com.list.LinkedListMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinkedList {


    @Test
    public void testLinkedList(){

        //Test of insertion of nodes
        LinkedListMethods testList = new LinkedListMethods();
        testList.addItem(1);
        testList.addItem(2);
        testList.addItem(3);
        Assertions.assertEquals(3,testList.count());

        //Test of deletion of node
        testList.remove( 1);
        Assertions.assertEquals(2,testList.count());

        //Test of size lo the list
        Assertions.assertEquals(2,testList.count());

        //Test of add node at particular index.
        testList.addItem(1,2);
        testList.addItem(8,3);
        Assertions.assertEquals(3,testList.count());
    }

}
