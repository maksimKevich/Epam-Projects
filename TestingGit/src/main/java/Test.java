/**
 * Created by maksim_kevich on 6/27/16.
 */
public class Test {
    public static void main(String[] args) {
//        Set<Book> books = new TreeSet<>();
//        books.add(new Book("b", 133));
//        books.add(new Book("y", 1));
//        books.add(new Book("a", 33));
//        books.add(new Book("d", 0));
//
//        for (Book t : books) {
//            System.out.println(t.getTitle() + " " + t.getYear());
//        }
        String email = "+375-29-1430899";
        String regax = "[^aA-bB]";
        System.out.println(email.matches("\\+[0-9]{3}\\-[0-9]{2}\\-[0-9]{7}"));
//        email.matches("[^a-zA-Z0-9_.]{1,}[@]{1}[a-z]{2,4}[.]{1}[a-z]{2,4}");

    }
}

/**
 * Interview questions
 * 1) Java
 * 1.Exception
 * - Error
 * - Exception:
 * - Unchecked Exceptions (Error)
 * - Checked (Runtime-exception исключения по вине программера и остальные по типу sql exception)
 * 2.Привидение типов
 * Superclass super = new SubClass();
 * SubClass subCl = new Subclass();
 * <p>
 * Допустимо - Superclass a = subCl;
 * SubClass subclass = (Subclass) super;
 * <p>
 * Superclass super = new SuperClass();
 * <p>
 * Не допустимо - Superclass c = (SubClass) c;
 * <p>
 * Виды полиморфизма - @Overriding @Overloading gentrics
 * конструкторы в абстрактном классе
 * <p>
 * Comparable vs Comporator
 * Interface Comparable задает свойство сравнения объекту реализующему его.
 * То есть делает объект сравнимым (по правилам разработчика)
 * <p>
 * Interface Comparator позволяет создавать объекты, которые будут управлять
 * процессом сравнения (например при сортировках).
 * <p>
 * maven - жизненный цикл, фазы http://devcolibri.com/769
 * как параллельно запустить тесты
 * <p>
 * фреймворки тестирования jMock Mockito, jUnit, TestNG
 * <p>
 * http soap rest ?
 * test ng - как задать порядок тестов приоритеты в аннотациях
 * jankins
 * kukunder
 * <p>
 * 3.
 * <p>
 * 2) Design patterns
 * - Static Factory - позволяет создовать объекты с ралзличным набором поараметров вез прямой записи new()
 * а с помощью фабрики factory.createUserWithAge(int age...)
 * - Factory method - WebDriver dr = new FirefoxDriverCreator() в конструктор я передаю тот драйвер кот. мне нужен
 * Strategy - паттерн определяет как сделать
 * Decorator - некоторые метожы остаются без изменению некоторые я модифицирую
 * Adapter - как переходник, адаптер имплементирует интерфейс который мне нужен
 * Composit - позволят работать через объект с одним или несколькими объектами
 * Command - Обеспечивает обработку команды в виде объекта, что позволяет сохранять её,
 * передавать в качестве параметра методам, а также возвращать её в виде результата, как и любой другой объект.
 * инкапсулирует вызов методов
 * Observer - подписчики! Есть объект Observer у него есть подписчики которые получают уведомления о любых изменениях
 * методом update
 * Singleton - ONLY ONE OBJECT IN PROGRAM!
 * Фасад - фасад использует композицию, есть Домашний кинотеатр у которого есть пося свет, Плеер, Телевизор и тд,
 * Есть конструктор где инициализируются все эти ссылки в и метод включить фильм в котором вызываются соответствующие методы
 * Шаблонный метод - инкапсуляция алгоритмов, есть один метод в которм в строгом порядке вызываюся методы.
 * <p>
 * Test theory
 * Чек лист набор идей(тест кейсов)
 * <p>
 * 1.Виды тестирования
 * - Метод черного ящика когда тестировщику не доступны исходники
 * - Метод белого ящика когда код открыт
 * - Метод серго ящика помесь
 * <p>
 * - Регрисионное сестирование - тестирование нового билда
 * - Модульное тестированияя - тестирование атомарных участков кода
 * - Интеграционное тестирование -
 * - Смоук тест - тестирование направленое на проверку основного функционала приложения
 * - Позитивное и негативное
 * - Альфа бэта
 * - Конфигурационное - направлено на способность работы на различных системах
 * - Тестирование производительности
 * <p>
 * 2. Поля BugReport
 * - Индификатор , Краткое описание, Подробное описание, Шаги по воспроизведению, Воспроизводимость,
 * важность, срочность, симптом, возмность обойти, коментарии, приложения
 * <p>
 * 3. Подходы к тестированию
 * тестирование по управлением данными, тестирование под управлением ключевыми словами,
 * разработка под управлением тестированием(Сначала тесты потом КОД!)
 */