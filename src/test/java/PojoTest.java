import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by kai on 10/5/17.
 */
public class PojoTest {

    @Test
    public void constructor_validParams_createsPojo() throws Exception {
        Pojo pojo = new Pojo("hello pojo");
        assertThat(pojo.getData(), is("hello pojo"));
    }

    @Test
    public void constructor_invalidParams_violationsSizeIsOne() throws Exception {
        Validator validator = new Validator();
        Pojo pojo = new Pojo(null);
        List<ConstraintViolation> violations = validator.validate(pojo);
        assertThat(violations.size(), is(1));
    }

}