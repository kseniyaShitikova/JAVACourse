import java.util.Arrays;

public class ArraysUtilExample {
    public static void main(String[] args) {
        // toString() - преобразование массива в строку
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("toString: " + Arrays.toString(numbers));
        
        // sort() - сортировка массива
        Arrays.sort(numbers);
        System.out.println("После sort: " + Arrays.toString(numbers));
        
        // binarySearch() - бинарный поиск (массив должен быть отсортирован)
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Индекс 8: " + index);
        
        // equals() - сравнение массивов
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        System.out.println("arr1 equals arr2: " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 equals arr3: " + Arrays.equals(arr1, arr3));
        
        // compare() - лексикографическое сравнение
        System.out.println("compare arr1 vs arr3: " + Arrays.compare(arr1, arr3));
        // возвращает отрицательное число, если первый массив меньше
    }
}