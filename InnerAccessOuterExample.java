/**
 * Демонстрация доступа внутреннего класса к полям внешнего
 */
public class InnerAccessOuterExample {
    
    private String privateField = "private field";
    public String publicField = "public field";
    protected String protectedField = "protected field";
    String defaultField = "default field";
    
    private void privateMethod() {
        System.out.println("private method");
    }
    
    public class Inner {
        public void accessOuter() {
            // Внутренний класс имеет доступ КО ВСЕМ полям и методам внешнего класса
            System.out.println(privateField);// доступ к private
            System.out.println(publicField); // доступ к public
            System.out.println(protectedField); // доступ к protected
            System.out.println(defaultField);  //доступ к default
            
            privateMethod();//доступ к private методу
        }
    }
    
    public static void main(String[] args) {
        InnerAccessOuterExample outer = new InnerAccessOuterExample();
        Inner inner = outer.new Inner();
        inner.accessOuter();
    }
}