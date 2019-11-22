package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testFindDuplicate() {
        ArrayShift classUnderTest = new ArrayShift();
        String[] arrayList = new String[]{"one","two","three"};
        assertFalse("someLibraryMethod should return 'true'", ArrayShift.findDuplicate(arrayList));

        String[] arrayListDuplicates = new String[]{"one","two","three","two"};
        assertTrue("someLibraryMethod should return 'true'", ArrayShift.findDuplicate(arrayListDuplicates));
    }

    @Test
    public void testArraylist() {
        ArrayShift classUnderTest = new ArrayShift();
        String[] arrayList = new String[]{"one","two","three","four"};
        String arrayItem = "five";
        String[] expectedList = new String[]{"one","two","five","three","four"};
        assertArrayEquals(expectedList,classUnderTest.insertShiftArray(arrayList,arrayItem) );
     }
}
