
public class Massive1 {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        a1 = a2;
        
        System.out.println("a1: " + java.util.Arrays.toString(a1)); // [6, 7, 8, 9, 10]
        System.out.println("a2: " + java.util.Arrays.toString(a2)); // [6, 7, 8, 9, 10]
    }
}
