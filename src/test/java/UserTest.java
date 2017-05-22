import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by kai-tait on 18/05/2017.
 */
public class UserTest {
    @Test
    public void userValidParamsNoException() throws Exception {
        User user = new User("foo",true,123);
        assertThat(user, is(not(nullValue())));
        assertThat(user.getFirstName(), is("foo"));
        assertThat(user.getLastName(), is(true));
        assertThat(user.getAge(), is(123));
    }
    
    @Test
    public void userLastNameNullNoException() throws Exception {
        User user = new User("foo",true, null);
        assertThat(user, is(not(nullValue())));
        assertThat(user.getFirstName(), is("foo"));
    }
    
    @Test(expected = ConstraintsViolatedException.class)
    public void userLastNameNotNullAgeNullThrowsException() throws Exception {
        User user = new User("foo",false, null);
    }
}