// Файл: pkg1/SamePackage.java
package pkg1;

public class SamePackage {
    public void test() {
        Parent p = new Parent();
        
        // p.privateVar = 10;  //Ошибка: private
        p.defaultVar = 10;// ok- default - тот же пакет
        p.protectedVar = 10; //ok- protected - тот же пакет
        p.publicVar = 10;//ok-public
        
        // p.privateMethod();//Ошибка: private
        p.defaultMethod();  //ok
        p.protectedMethod(); //ok
        p.publicMethod(); //ok
    }
}