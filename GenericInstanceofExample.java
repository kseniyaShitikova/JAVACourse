import java.util.ArrayList;
import java.util.List;

/**
 * Демонстрация использования instanceof с параметризованными классами
 */
public class GenericInstanceofExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        
        // Проверка списка
        System.out.println(stringList instanceof List);// true
        System.out.println(stringList instanceof ArrayList); // true
        
        // System.out.println(stringList instanceof List<String>);-нельзя
        // Ошибка компиляции: нельзя проверять конкретный параметр типа
        
        // Обход через wildcard
        System.out.println(stringList instanceof List<?>);// true
        
        // Пример с пользовательским классом
        Wrapper<Integer> intWrapper = new Wrapper<>();
        Wrapper<String> strWrapper = new Wrapper<>();
        
        System.out.println(intWrapper instanceof Wrapper);// true
        System.out.println(intWrapper instanceof Wrapper<?>);// true
        // System.out.println(intWrapper instanceof Wrapper<Integer>);// Ошибка
    }
}

class Wrapper<T> {
    private T item;
    
    public void setItem(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}