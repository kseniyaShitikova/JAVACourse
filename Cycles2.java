
public class Cycles2 {
    public static void main(String[] args) {
        // break - выход из цикла
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // выход при i = 5
            }
            System.out.print(i + " ");  // 1 2 3 4
        }
        
        System.out.println();
        
        // continue - пропуск итерации
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // пропустить чётные
            }
            System.out.print(i + " ");  // 1 3 5 7 9
        }
        
        System.out.println();
        
        // break в while
        int j = 0;
        while (true) {
            j++;
            if (j == 5) {
                break;  // выход из бесконечного цикла
            }
        }
        
        // continue в do-while
        int k = 0;
        do {
            k++;
            if (k == 3) {
                continue;  // пропустить k = 3
            }
            System.out.print(k + " ");  // 1 2 4 5
        } while (k < 5);
    }
}
