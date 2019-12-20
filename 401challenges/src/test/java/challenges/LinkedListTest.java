package challenges;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    @Test public void testSomeLibraryMethod() {
        LinkedList lList = new LinkedList();
        assertTrue("add should add the list successfully", lList.insert("cookie"));
        assertTrue("add should add the list successfully", lList.insert("chocolate"));
        assertTrue("add should add the list successfully", lList.insert("biscuit"));

        System.out.println(lList.toString());
        System.out.println(lList.pop());
        System.out.println(lList.toString());

        System.out.println(lList.pop());
        System.out.println(lList.toString());
        System.out.println(lList.pop());
    }
}
