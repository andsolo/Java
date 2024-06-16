// API (application programming interface) -- это контракт,
// который предоставляет программа. Это возможности,
// которые предоставляют разработчики языка для удобного
// взаимодействия с его функционалом.

// Пример:
// Создать строку из 1 млн символов (+):

// StringBuilder sb = new StringBuilder();
// for(int i=0;i<1_000_000;i++){
//     sb.append("+");
// }
// ----------------------------------------------------------

// API, работа со строками:

// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с
// подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

// Пример:
// public class program {
// public static void main(String[] args) {
// String[] name = { "C", "е", "р", "г", "е", "й" };
// String sk = "СЕРГЕЙ КА.";
// System.out.println(sk.toLowerCase()); // сергей ка.
// System.out.println(String.join("", name)); // Cергей
// System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); //
// C,е,р,г,е,й
// System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
// }
// }
// ----------------------------------------------------------

// РАБОТА С ФАЙЛОВОЙ СИСТМОЙ

// Для работы нужно:
// File <имя> = new File(<полный путь к файлу>);
// File f1 = new File("file.txt");
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

// try {
// Код, в котором может появиться ошибка
// } catch (Exception e) {
// Обработка, если ошибка случилась
// }
// finally {
// Код, который выполнится в любом случае
// }

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в
// каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся в
// определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в
// каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся в
// определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// ----------------------------------------------------------

// Логирование:

// Логи содержат системную информацию работы программного или аппаратного
// комплекса.
// В них записываются действия разного приоритета от пользователя, или
// программного продукта.
// Процесс ведения логов называют “логированием” (журналированием).

// Использование:
// Logger logger=Logger.getLogger()
// Уровни важности 
// INFO,DEBUG,ERROR,WARNING и др.
// Вывод 
// ConsoleHandler info=new ConsoleHandler();
// log.addHandler(info);
// Формат вывода:структурированный,абы как*
// XMLFormatter,SimpleFormatter

// Пример логирования и вывод в консоль:

// import java.util.logging.*;

// public class Ex0043 {
//     public static void main(String[] args) {
//         Logger logger = Logger.getLogger(Ex0043.class.getName());
//         logger.setLevel(Level.INFO);
//         ConsoleHandler ch = new ConsoleHandler();
//         logger.addHandler(ch);
//         SimpleFormatter sFormat = new SimpleFormatter();
//         ch.setFormatter(sFormat);
//         logger.log(Level.WARNING, "Тестовое логирование");
//         logger.info("Тестовое логирование");
//     }
// }

// Пример логирования и вывод в XML файл:

// import java.util.logging.*;

// public class Ex0043 {
//     public static void main(String[] args) {
//         Logger logger = Logger.getLogger(Ex0043.class.getName());
//         logger.setLevel(Level.INFO);
//         ConsoleHandler ch = new ConsoleHandler();
//         logger.addHandler(ch); // SimpleFormatter sFormat = new SimpleFormatter();
//         XMLFormatter xml = new XMLFormatter(); // ch.setFormatter(sFormat);
//         ch.setFormatter(xml);
//         logger.log(Level.WARNING, "Тестовое логирование");
//         logger.info("Тестовое логирование");
//     }
// }