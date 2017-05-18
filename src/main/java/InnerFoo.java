import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

/**
 * Created by kai-tait on 12/05/2017.
 */
@Guarded
public class InnerFoo {
    private final Boolean canBeNull;
    private final String description;
    
    
    public InnerFoo(@NotNull final Boolean canBeNull,
                    @NotNull final String description) {
        this.canBeNull = canBeNull;
        this.description = description;
    }
}
