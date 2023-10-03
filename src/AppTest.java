// BEGIN: x9d5c3f7b5a2
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testAdd() {
        assertEquals(10, App.add(5, 5));
        assertEquals(0, App.add(0, 0));
        assertEquals(-10, App.add(-5, -5));
    }
    
    @Test
    public void testSub() {
        assertEquals(0, App.sub(5, 5));
        assertEquals(0, App.sub(0, 0));
        assertEquals(0, App.sub(-5, -5));
    }
    
    @Test
    public void testMul() {
        assertEquals(25, App.mul(5, 5));
        assertEquals(0, App.mul(0, 0));
        assertEquals(25, App.mul(-5, -5));
    }
    
    @Test
    public void testDiv() {
        assertEquals(1, App.div(5, 5));
        assertEquals(0, App.div(0, 5));
        assertEquals(-1, App.div(-5, 5));
    }
}
// END: x9d5c3f7b5a2