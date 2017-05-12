import net.sf.oval.exception.ConstraintsViolatedException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FooTest {

    @Test
    public void constructorCalled_ValidParams_FooCreated() {
        Foo foo = new Foo("bar", new InnerFoo("coffee bean"));
        assertThat(foo.getName(), is("bar"));
    }
    
    @Test(expected = ConstraintsViolatedException.class)
    public void constructorCalled_innerObjectNullField_ThrowsException() {
        new Foo(null, new InnerFoo(null));
    }
    
    @Test(expected = ConstraintsViolatedException.class)
    public void constructorCalled_bothParamsNull_ThrowsException() {
        new Foo(null, null);
    }
    
    @Test(expected = ConstraintsViolatedException.class)
    public void constructorCalled_innerObjectNull_ThrowsException() {
        new Foo("foooo", null);
    }
}