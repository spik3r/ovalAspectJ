import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

@Guarded
public class Foo {
    
    private final String name;
    
    public Foo(@NotNull @NotEmpty final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
