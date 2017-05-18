import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Test;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by kai-tait on 17/05/2017.
 */
    
    public class BusinessObjectTest {
        @Test
        public void fieldANullFieldBNotValidatedNoViolations() {
            BusinessObject businessObject = new BusinessObject(null, null);
            Validator validator = new Validator();
            validator.validate(businessObject);
        }
        
        @Test//(expected = ConstraintsViolatedException.class)
        public void fieldANotNullFieldBValidatedViolationsSizeIsOne() {
            BusinessObject businessObject = new BusinessObject("A", null);
            Validator validator = new Validator();
            List<ConstraintViolation> errors = validator.validate(businessObject);
            System.out.println(errors.size());
            assertThat(errors.size(), is(1));
        }
        
        @Test
        public void fieldANullFieldBNotNullNoViolations() {
            BusinessObject businessObject = new BusinessObject(null, "B");
            Validator validator = new Validator();
            validator.validate(businessObject);
        }
    }