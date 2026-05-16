public class NullPointerBoxing {
    public static void main(String[] args) {
        Integer nullInteger = null;
        
        // Будет NullPointerException при распаковке
        int value = nullInteger;  // НО: ошибка компиляции? 
        // На самом деле ошибка будет в рантайме при обращении
        
        // Правильный пример:
        Integer num = null;
        try {
            int result = num;  // unboxing null -> NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при распаковке");
        }
        
        // Ещё пример:
        Integer obj = null;
        System.out.println(obj + 5);  // NullPointerException при распаковке
    }
}