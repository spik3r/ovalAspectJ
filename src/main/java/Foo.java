import net.sf.oval.constraint.AssertValid;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

@Guarded
public class Foo {
    
    private final String name;
    private final InnerFoo innerFoo;
    
    public Foo(@NotNull @NotEmpty final String name,
               @NotNull InnerFoo innerFoo) {
        this.name = name;
        this.innerFoo = innerFoo;
    }
    
    public String getName() {
        return this.name;
    }
    
    public InnerFoo getInnerFoo() {
        return this.innerFoo;
    }
}
