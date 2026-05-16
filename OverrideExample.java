/**
 * Пример переопределённого метода
 * Если у переопределённого и переопределяемого методов 
 * не совпадает тип возвращаемого значения, возникнет ошибка компиляции.

Исключение: если тип возвращаемого значения в подклассе является 
* подтипом (наследником) типа возвращаемого значения суперкласса. 
* Это называется ковариантным возвращаемым типом.
* class Parent {
    public Number getNumber() {
        return 10;
    }
}

class Child extends Parent {
    @Override
    public Integer getNumber() {  // Integer - подтип Number
        return 20;
    }
}
 */
public class OverrideExample {
    
    class Parent {
        public void show() {
            System.out.println("Parent show()");
        }
        
        public int getValue() {
            return 10;
        }
    }
    
    class Child extends Parent {
        @Override
        public void show() {
            System.out.println("Child show()");
        }
    }
}