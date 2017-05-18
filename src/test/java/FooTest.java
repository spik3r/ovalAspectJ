import net.sf.oval.exception.ConstraintsViolatedException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FooTest {

    @Test
    public void constructorCalled_ValidParams_FooCreated() {
        InnerFoo innerFoo = new InnerFoo(false, "coffee bean");
        Foo foo = new Foo("bar", innerFoo);
        assertThat(foo.getName(), is("bar"));
    }

    @Test(expected = ConstraintsViolatedException.class)
    public void constructorCalled_innerObjectCanBeNullFalseWithNullField_NoException() {
        Foo foo = new Foo("bar", new InnerFoo(false, null));
        assertThat(foo.getName(), is("bar"));
    }

    @Test(expected = ConstraintsViolatedException.class)
    public void constructorCalled_innerObjectNullField_ThrowsException() {
        new Foo(null, new InnerFoo(false, null));
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