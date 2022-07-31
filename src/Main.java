import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

/* Задание 4
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку
с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...” */
        System.out.println("Задание 4.");

        String fullName = "Ivanov Ivan Ivanovich";
        String[] words = fullName.split(" ");
        String lastName = words[0];
        String firstName = words[1];
        String middleName = words[2];
        System.out.println("Фамилия сотрудника — " + lastName + ". Имя сотрудника — " + firstName + ". Отчество сотрудника — " + middleName + ".");

        System.out.println();

        /*Задание 5
Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв
 Ф. И. О. в правильный формат.
В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
 которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
:sos: Подсказка 1
Метод toCharArray() может быть полезен.
:sos: Подсказка 2
Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ. */
        System.out.println("Задание 5.");

        String fullName2 = "ivanov ivan ivanovich";
        String[] words2 = fullName2.split(" ");
        for (String s : words2) {

            System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
        }
        System.out.println("\n");

     /*   Задание 6
Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”
:sos: Подсказка
Следует использовать StringBuilder.*/

        System.out.println("Задание 6.");
        String s1 = "135";
        String s2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }
        System.out.println(sb);

    }
}