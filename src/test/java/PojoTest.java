import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Test;


/**
 * Created by kai-tait on 17/05/2017.
 */
public class PojoTest
{
    //@Test
    public void fieldANullFieldBNotValidated() {
        Pojo pojo = new Pojo(null, null);
    }
    
    //@Test(expected = ConstraintsViolatedException.class)
    public void fieldANotNullFieldBValidatedThrowsException() {
        Pojo pojo = new Pojo("A", null);
    }
}