// Файл: pkg1/Parent.java
package pkg1;

public class Parent {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;
    
    private void privateMethod() {
        System.out.println("private: только внутри класса");
    }
    
    void defaultMethod() {
        System.out.println("default: только внутри пакета pkg1");
    }
    
    protected void protectedMethod() {
        System.out.println("protected: внутри pkg1 + подклассы в других пакетах");
    }
    
    public void publicMethod() {
        System.out.println("public: везде");
    }
    
    public void testInsideClass() {
        privateVar = 10;      // ok
        defaultVar = 10;      // ok
        protectedVar = 10;    // ok
        publicVar = 10;       // ok
        privateMethod();      //  ok
        defaultMethod();      // ok
        protectedMethod();    // ok
        publicMethod();       // ok
    }
}
