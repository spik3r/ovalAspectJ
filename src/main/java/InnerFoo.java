import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

/**
 * Created by kai-tait on 12/05/2017.
 */
@Guarded
public class InnerFoo {
    private final String description;
    
    public InnerFoo(@NotNull final String description) {
        this.description = description;
    }
}
