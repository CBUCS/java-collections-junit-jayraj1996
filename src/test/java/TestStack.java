import cbu527.com.list.StackMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStack {


    @Test
    public void testStack(){

        StackMethods stackMethods = new StackMethods();

        //Test of add the elements on stack
        stackMethods.addItem(1);
        stackMethods.addItem(2);
        stackMethods.addItem(3);
        Assertions.assertEquals(4,stackMethods.count());

        //Test of remove an element from stack
        stackMethods.remove(4);
        Assertions.assertEquals(4,stackMethods.count());

        //Test of the size of the stack
        Assertions.assertEquals(4,stackMethods.count());

        //Test of the add a particular element at particular index
        stackMethods.addItem(6,5);
        stackMethods.addItem(7,6);
        Assertions.assertEquals(6,stackMethods.count());



    }
}
