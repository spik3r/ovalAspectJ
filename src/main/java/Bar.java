import net.sf.oval.configuration.annotation.IsInvariant;
import net.sf.oval.constraint.NotNull;

public class Bar {

    private final String name;

    public Bar() {
        this.name = null;
    }

    @NotNull
    @IsInvariant
    public String getName() {
        return this.name;
    }
}
