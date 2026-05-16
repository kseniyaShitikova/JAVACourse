// Файл: pkg2/Subclass.java
package pkg2;
import pkg1.Parent;

public class Subclass extends Parent {
    public void test() {
        // privateVar = 10; // Ошибка: private
        // defaultVar = 10; //Ошибка: default - другой пакет
        protectedVar = 10; //ok - protected - подкласс
        publicVar = 10; // ok -public
        
        // privateMethod(); // ❌
        // defaultMethod(); // ❌
        protectedMethod(); // ok 
        publicMethod(); // ok 
    }
}