import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

/**
 * Created by kai-tait on 17/05/2017.
 */

    public class BusinessObject {
        private String fieldA;
        
        @NotNull(when = "javascript:_this.fieldA != null")
        private String fieldB;
        
        public BusinessObject(){}
        
        public BusinessObject(String fieldA, String fieldB) {
            this.fieldA = fieldA;
            this.fieldB = fieldB;
        }
        
        public String getFieldA() {
            return this.fieldA;
        }
        public void setFieldB(String fieldB) {
            this.fieldB = fieldB;
        }
    }