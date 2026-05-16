/**
 * Демонстрация вложения класса в интерфейс
 */
public class NestedInInterfaceExample {
    
    // Интерфейс со вложенным классом
    interface Vehicle {
        void move();
        
        // Вложенный класс внутри интерфейса (всегда public static)
        class Engine {
            private String type;
            
            public Engine(String type) {
                this.type = type;
            }
            
            public void start() {
                System.out.println("Двигатель " + type + " запущен");
            }
            
            public void stop() {
                System.out.println("Двигатель " + type + " остановлен");
            }
        }
    }
    
    // Реализация интерфейса
    class Car implements Vehicle {
        @Override
        public void move() {
            System.out.println("Машина едет");
        }
    }
    
    public static void main(String[] args) {
        // Способ 1: вызов метода вложенного класса напрямую
        Vehicle.Engine engine1 = new Vehicle.Engine("Бензиновый");
        engine1.start();
        engine1.stop();
        
        // Способ 2: через объект реализующего класса (класс не влияет на вызов)
        NestedInInterfaceExample outer = new NestedInInterfaceExample();
        Car car = outer.new Car();
        car.move();
        
        Vehicle.Engine engine2 = new Vehicle.Engine("Электрический");
        engine2.start();
    }
}