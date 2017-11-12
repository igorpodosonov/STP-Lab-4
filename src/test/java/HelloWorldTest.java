import org.junit.Test;
import Lab1.HelloWorld;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() throws Exception {
        assertEquals(HelloWorld.text(), "Hello, world!");
    }
}
