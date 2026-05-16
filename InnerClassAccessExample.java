/**
 * Демонстрация спецификаторов доступа для внутренних классов
 */
public class InnerClassAccessExample {
    
    // public - доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("Public inner class");
        }
    }
    
    // private - доступен только внутри внешнего класса
    private class PrivateInner {
        public void show() {
            System.out.println("Private inner class");
        }
    }
    
    // protected - доступен в пакете и подклассах внешнего класса
    protected class ProtectedInner {
        public void show() {
            System.out.println("Protected inner class");
        }
    }
    
    // default (без спецификатора) - доступен только внутри пакета
    class DefaultInner {
        public void show() {
            System.out.println("Default inner class");
        }
    }
    
    public void testAccess() {
        // Внутри внешнего класса доступны все внутренние классы
        PublicInner p = new PublicInner();
        PrivateInner pr = new PrivateInner();   // ✅ доступен
        ProtectedInner prot = new ProtectedInner();
        DefaultInner d = new DefaultInner();
    }
    
    public static void main(String[] args) {
        InnerClassAccessExample outer = new InnerClassAccessExample();
        
        // public - доступен
        PublicInner pub = outer.new PublicInner();
        pub.show();
        
        // private - НЕ ДОСТУПЕН извне (ошибка компиляции)
        // PrivateInner priv = outer.new PrivateInner();
        
        // protected - доступен (в том же пакете)
        ProtectedInner prot = outer.new ProtectedInner();
        prot.show();
        
        // default - доступен (в том же пакете)
        DefaultInner def = outer.new DefaultInner();
        def.show();
    }
}