/**
 * Пример перегрузки (overloading) методов
 * Перегрузка - несколько методов с одним именем, но разными параметрами
 */
class Calculator {
    // Перегруженные методы sum
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    public double sum(double a, double b) {
        return a + b;
    }
}

/**
 * Пример переопределения (override) методов
 * Переопределение - подкласс меняет реализацию метода суперкласса
 */
class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу-мяу");
    }
}

public class OverloadOverrideDem {
    public static void main(String[] args) {
        // Перегрузка: один метод sum, но разные варианты
        Calculator calc = new Calculator();
        System.out.println("sum(2, 3) = " + calc.sum(2, 3));
        System.out.println("sum(2, 3, 4) = " + calc.sum(2, 3, 4));
        System.out.println("sum(2.5, 3.7) = " + calc.sum(2.5, 3.7));
        
        // Переопределение: один метод makeSound, но разное поведение
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();  // Собака лает
        myCat.makeSound();  // Кошка мяукает
    }
}