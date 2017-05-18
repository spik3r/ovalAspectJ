import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kai-tait on 18/05/2017.
 */
public class UserTest
{
    @Test
    public void userBuilderValidParamsNoException() throws Exception
    {
        User user = new User.UserBuilder("foo").lastName("bar").age(123).build();
    }
    
    @Test
    public void userBuilderLastNameNullNoException() throws Exception
    {
        User user = new User.UserBuilder("test").lastName(null).build();
    }
    
    @Test
    public void userBuilderLastNameNotNullAgeNullThrowsException() throws Exception
    {
        User user = new User.UserBuilder("test").lastName("user").build();
    }
}