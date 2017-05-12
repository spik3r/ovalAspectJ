import org.aspectj.lang.annotation.*;

@Aspect
public class BasicAspect {
    
    @After("@annotation(DoMagic) && execution(* *(..))")
    public void annotationPointCutDefinition(){
        System.out.println(" ...   ...   ....");
        System.out.println("... After ....");
        System.out.println(" ...   ...   ....");
    }
    
    @Before("@annotation(DoMagic) && execution(* *(..))")
    public void printSomething() {
        System.out.println("Printing... from @Before");
        someCommonMethod();
    }
    
    private void someCommonMethod() {
        System.out.println("Printing... from someCommonMethod");
        System.out.println("if foo");
        System.out.println("do bar");
        System.out.println("else explode");
    }
}
