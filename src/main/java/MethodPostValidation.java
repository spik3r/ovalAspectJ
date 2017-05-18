import net.sf.oval.constraint.MaxLength;
import net.sf.oval.guard.Guarded;
import net.sf.oval.guard.PostValidateThis;

/**
 * Created by kai-tait on 18/05/2017.
 */
@Guarded
public class MethodPostValidation {
    
    private boolean someVariable = true;

    @MaxLength(value = 10, when = "javascript:_this.someVariable == true")
    private String name = "12345";
    
    MethodPostValidation(){}
    
    MethodPostValidation(boolean someVariable) {
        this.someVariable = someVariable;
    }
    
    @PostValidateThis
    public void appendToName(String appendix)
    {
        name += appendix;
    }
    
    public boolean getSomeVariable() {
        return this.someVariable;
    }
}
