
public class BasicAOPClass {
    
    public static void main(String[] args) {
        BasicAOPClass basicAOPClass = new BasicAOPClass();
        basicAOPClass.doSomething();
    }
    
    @DoMagic
    public void doSomething(){
        System.out.println("Executing doSomething()");
    }
}
