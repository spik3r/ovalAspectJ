import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class BarTest {
    @Test
    public void getName_nameIsNull_violationsSizeIsOne() throws Exception {
        Validator validator = new Validator();
        Bar bar = new Bar();
        List<ConstraintViolation> violations = validator.validate(bar);
        assertThat(violations.size(), is(1));
    }

}