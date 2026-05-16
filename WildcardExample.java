import java.util.ArrayList;
import java.util.List;

/**
 * Демонстрация <? extends T> и <? super T>
 */
public class WildcardExample {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        
        ints.add(10);
        ints.add(20);
        numbers.add(100);
        numbers.add(200);
        
        // <? extends T> - можно читать как T, нельзя писать
        System.out.println("--- <? extends Number> ---");
        printNumbers(ints);//List<Integer> подходит
        printNumbers(doubles);// List<Double> подходит
        printNumbers(numbers); //List<Number> подходит
        // printNumbers(objects); //Object не является Number или подклассом
        
        // <? super T> - можно писать T, читать как Object
        System.out.println("--- <? super Integer> ---");
        addIntegers(numbers); // List<Number> подходит
        addIntegers(objects); // List<Object> подходит
        // addIntegers(ints);// List<Integer> не подходит (Integer не суперкласс)
    }
    
    // Метод принимает список любых чисел (можно читать элементы)
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
        // list.add(42); //нельзя добавлять (тип неизвестен)
    }
    
    // Метод принимает список, в который можно добавить Integer
    public static void addIntegers(List<? super Integer> list) {
        list.add(42); // можно добавлять Integer
        list.add(100);  // можно добавлять Integer
        // Integer i = list.get(0); //  нельзя читать как Integer (только Object)
        Object obj = list.get(0); // можно читать как Object
    }
}