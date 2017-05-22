import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;
import net.sf.oval.guard.PostValidateThis;

/**
 * Created by kai-tait on 18/05/2017.
 */
@Guarded(checkInvariants = false)// removing this results in StackOverflowError
public class User {
    private final String firstName;
    private final Boolean lastName;
    @NotNull(when = "javascript:_this.lastName == false")
    private final Integer age;
    
    @PostValidateThis
    public User(String firstName, Boolean lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public Boolean getLastName() {
        return lastName;
    }
    
    public Integer getAge() {
        return age;
    }
}
