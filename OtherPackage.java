// Файл: pkg2/OtherPackage.java
package pkg2;
import pkg1.Parent;

public class OtherPackage {
    public void test() {
        Parent p = new Parent();
        
        // p.privateVar = 10; //ошибка
        // p.defaultVar = 10;  // ошибка другой пакет + не подкласс
        // p.protectedVar = 10;// ощибка - другой пакет + не подкласс
        p.publicVar = 10;  // ok-  public
    }
}