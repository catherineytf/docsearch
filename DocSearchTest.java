import java.io.IOException;
import java.net.URI;
import static org.junit.Assert.*;
import org.junit.*;
import java.net.URISyntaxException;


public class DocSearchTest {
    @Test
    public void testhandleRequest() throws URISyntaxException, IOException {
        URI test1 = new URI(null);
        Handler h = new Handler(null);
        assertEquals("Don't know how to handle that path!", h.handleRequest(test1));
        
    }
    
    
}
