
public class EqualsExample {
       
    class Person {
        private String name;
        private int age;
        private int passportId;
        
        public Person(String name, int age, int passportId) {
            this.name = name;
            this.age = age;
            this.passportId = passportId;
        }
        
        @Override
        public boolean equals(Object obj) {
            // 1. Проверка на идентичность (один и тот же объект)
            if (this == obj) {
                return true;
            }
            
            // 2. Проверка на null
            if (obj == null) {
                return false;
            }
            
            // 3. Проверка на совпадение классов
            if (getClass() != obj.getClass()) {
                return false;
            }
            
            // 4. Приведение типа и сравнение значимых полей
            Person other = (Person) obj;
            return age == other.age && 
                   passportId == other.passportId &&
                   name.equals(other.name);
        }
        
        @Override
        public int hashCode() {
            // При переопределении equals всегда нужно переопределять hashCode
            return name.hashCode() + age * 31 + passportId;
        }
    }
}
/**
 * Соглашения:
 * Рефлексивность — объект должен быть равен самому себе: x.equals(x) возвращает true.
 * Симметричность - если x.equals(y) возвращает true, то y.equals(x) также должен возвращать true.
 * Транзитивность - если x.equals(y) и y.equals(z) возвращают true, то x.equals(z) также должен возвращать true.
 * Постоянство - при многократном вызове equals() на одних и тех же объектах результат должен быть одинаковым (при условии, что поля не менялись).
 * Сравнение с null - x.equals(null) всегда должен возвращать false, а не выбрасывать NullPointerException.
 * Согласованность с hashCode() - если два объекта равны по equals(), их hashCode() должны быть одинаковыми.
 */