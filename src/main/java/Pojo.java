import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;
import net.sf.oval.guard.PostValidateThis;

/**
 * Created by kai-tait on 17/05/2017.
 */

@Guarded(checkInvariants = false)// removing this results in StackOverflowError
public class Pojo {
    private String fieldA;
    
    @NotNull(when = "javascript:_this.fieldA != null")
    private String fieldB;
    
    @PostValidateThis
    public Pojo(String fieldA, String fieldB) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
    }
    
    public String getFieldA() {
        return this.fieldA;
    }
}