import net.sf.oval.exception.ExceptionTranslator;
import net.sf.oval.exception.OValException;
import net.sf.oval.guard.GuardAspect;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class GuardedExtension extends GuardAspect {
    
//    public GuardedExtension() {
//        super();
//
//        getGuard().setExceptionTranslator(new ExceptionTranslator()
//        {
//            @Override
//            public RuntimeException translateException(OValException ex)
//            {
//                throw new RuntimeException();
//            }
//        });
//    }
}
