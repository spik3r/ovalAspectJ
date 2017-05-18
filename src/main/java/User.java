import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;
import net.sf.oval.guard.PostValidateThis;

/**
 * Created by kai-tait on 18/05/2017.
 */
public class User {
    private final String firstName; // required
    private final String lastName; // optional
    private final int age; // optional
    
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public int getAge() {
        return age;
    }
    
    @Guarded
    public static class UserBuilder {
        private final String firstName;
        private String lastName;
        
        @NotNull(when = "_this.lastName != null")
        private int age;
        
        public UserBuilder(String firstName) {
            this.firstName = firstName;
        }
    
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        @PostValidateThis
        public User build() {
            return new User(this);
        }
    }
}
