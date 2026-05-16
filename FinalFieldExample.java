/**
 * Демонстрация всех способов инициализации final-поля
 */
public class FinalFieldExample {
    public final int a;

    // Способ 1: в конструкторе
    public FinalFieldExample() {
        a = 10;
    }
    
    // Способ 2: в конструкторе с параметром
    public FinalFieldExample(int value) {
        a = value;
    }
    
    // Способ 3: при объявлении (закомментировала, т.к. конфликтует с конструкторами)
    // public final int a = 5;
    
    // Способ 4: в блоке инициализации
    // {
    //     a = 15;
    // }
}