import net.sf.oval.exception.ConstraintsViolatedException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FooTest {

    @Test
    public void constructorCalled_ValidParams_FooCreated() {
        Foo foo = new Foo("bar");
        assertThat(foo.getName(), is("bar"));
    }
    
    @Test(expected = ConstraintsViolatedException.class)
    public void constructorCalled_nullName_ThrowsException() {
        new Foo(null);
    }
    
    @Test(expected = ConstraintsViolatedException.class)
    public void constructorCalled_blankName_ThrowsException() {
        new Foo("");
    }
}