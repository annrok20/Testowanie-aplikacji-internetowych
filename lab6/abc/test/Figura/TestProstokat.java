
package Figura;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestProstokat {
    
    @Test
    public void testpoleProstokata {
    Prostokat ptest = new Prostokat(3,5);
    AssertEqual(15,ptest.poleProstokata());
    
}
}
    
    
}
