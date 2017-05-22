import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by kai-tait on 18/05/2017.
 */
    public class MethodPostValidationTest {
        @Test(expected = ConstraintsViolatedException.class)
        public void getFieldTooLongThrowsException() throws Exception {
            MethodPostValidation methodPostValidation = new MethodPostValidation();
            methodPostValidation.appendToName("asdfghjkl");
            
        }
        
        @Test
        public void getFieldSomeVariableFalseDoesNotValidateNoException() throws Exception {
            MethodPostValidation methodPostValidation = new MethodPostValidation(false);
            methodPostValidation.appendToName("asdfghjkl");
        }
    }