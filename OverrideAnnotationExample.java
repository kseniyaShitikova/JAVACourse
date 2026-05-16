/**
 * Демонстрация использования @Override для обнаружения ошибок
 */
public class OverrideAnnotationExample {
    
    class Parent {
        public void showMessage() {
            System.out.println("Parent message");
        }
    }
    
    class ChildCorrect extends Parent {
        @Override
        public void showMessage() {  // правильно: имя метода совпадает
            System.out.println("Child message");
        }
    }
    
    class ChildWrong extends Parent {
        // Ошибка! Метод назван showmessage (с маленькой m)
        // Аннотация @Override заставит компилятор выдать ошибку
        // @Override
        // public void showmessage() {
        //     System.out.println("Wrong");
        // }
    }
}