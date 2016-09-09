#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.extension;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AppTest {
    
    @Test
    public void test() {
        String ezyfox = "ezyfox";
        assertEquals(ezyfox, "ezyfox");
    }
}
