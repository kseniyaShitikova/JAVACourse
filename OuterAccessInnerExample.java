/**
 * Демонстрация доступа внешнего класса к полям и методам внутреннего
 */
public class OuterAccessInnerExample {
    
    public class Inner {
        private String innerPrivate = "inner private";
        public String innerPublic = "inner public";
        protected String innerProtected = "inner protected";
        String innerDefault = "inner default";
        
        private void innerPrivateMethod() {
            System.out.println("inner private method");
        }
        
        public void innerPublicMethod() {
            System.out.println("inner public method");
        }
    }
    
    public void accessInner() {
        Inner inner = new Inner();
        
        // Внешний класс имеет доступ КО ВСЕМ полям и методам внутреннего
        System.out.println(inner.innerPrivate); //доступ к private
        System.out.println(inner.innerPublic);// доступ к public
        System.out.println(inner.innerProtected);//доступ к protected
        System.out.println(inner.innerDefault); // доступ к default
        
        inner.innerPrivateMethod();// доступ к private методу
        inner.innerPublicMethod();//доступ к public методу
    }
    
    public static void main(String[] args) {
        OuterAccessInnerExample outer = new OuterAccessInnerExample();
        outer.accessInner();
    }
}