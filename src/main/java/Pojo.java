import net.sf.oval.constraint.NotNull;

/**
 * Created by kai on 10/5/17.
 */
public class Pojo {

    @NotNull
    private String data;

    public Pojo(String data) {
        this.data = data;
    }
    public String getData(){
        return this.data;
    }

}
