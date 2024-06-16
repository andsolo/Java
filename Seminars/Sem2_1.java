
// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

// public class Sem2_1 {
//     public static void main(String[] args) {
//         int n = 8;
//         char c1 = 'A';
//         char c2 = 'B';

//         System.out.println(SwapChars(n, c1, c2));
//         System.out.println(SwapCharsSB(n, c1, c2));
//     }

//     public static String SwapChars(int n, char c1, char c2) {
        
//         String str = " ";
//         for (int i = 0; i < n / 2; i++) {
//             str = str + c1 + c2;
//         }
//         return str;
//     }

//     public static String SwapCharsSB(int n, char c1, char c2) {
        
//         StringBuilder sb = new StringBuilder(n);
//         for (int i = 0; i < n / 2; i++) {
//             sb.append(c1).append(c2);
//         }
//         return sb.toString();
//     }   
// }
//-------------------------------------------------------------------
// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
    
// public class Sem2_1 {

//     public static void main(String[] args) {
//         String str = "aaaabbbcdd";
//         System.out.println(compressStr(str));
//     }

//     public static String compressStr(String str){
//         int count = 1;
//         StringBuilder sb = new StringBuilder();
//         char currentChar = str.charAt(0);

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == currentChar){
//                 count++;
//             }
//             else{
//                 sb.append(currentChar).append(count);
//                 currentChar = str.charAt(i);
//                 count = 1;
//             }
//         }
//         sb.append(currentChar).append(count);
//         return sb.toString();
//     }
// }
//-------------------------------------------------------------------
// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

// public class Sem2_1 {
//     public static void main(String[] args) {
//         System.out.println(isPalindrom("довод"));
//     }
//     static boolean isPalindrom(String str){
//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
//-------------------------------------------------------------------
// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

// import java.io.File;
// import java.io.FileWriter;

// public class Sem2_1 {

//     public static void main(String[] args) {
//         String str = "TEST";
//         int n = 100;
//         String newStr = sringMaker(str, n);
//         String fileName = "text.txt";
//         writeToFile(newStr, fileName);
//     }

//     public static String sringMaker(String str, int n) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             sb.append(str).append(" ");
//         }
//         return sb.toString();
//     }
    
//     public static void writeToFile(String str, String fileName) {
//         try(FileWriter fw = new FileWriter(fileName, true)){   // если с true, то файл будет дополняться, без создания нового
//             fw.write(str);
//             fw.write(System.lineSeparator());   // перевод на новую строку
//             System.out.println("Succes");
//         } catch (Exception e){
//             System.err.println("Error, file is not written");
//         }
//     }
// }
//-------------------------------------------------------------------
// 📌 Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// public class Sem2_1 {

//     private static Logger logger = Logger.getLogger(Sem2_1.class.getName()); // встроенный логгер (АПИ)

//     public static void main(String[] args) {
//         configLogger();
//         String[] contentFolder = getFileList(System.getProperty("user.dir"));
//         writeArrayToFile(contentFolder, "contentFolder.txt");
//     }

//     static String[] getFileList(String folderName){      // метод, который вернет содержимое текущей папки в виде массива строк
//         File currentFolder = new File(folderName);
//         return currentFolder.list();
//     }

//     static void configLogger(){                          // Обработка ошибки с помощью try-catch конструкции и вывод логгера в файл
//         try {
//             //logger.setUseParentHandleruseParentHandlers:s(false);             // без вывода лога в консоль 
//             FileHandler fh = new FileHandler("log.txt", true);
//             logger.addHandler(fh);
//             SimpleFormatter sf = new SimpleFormatter();
//             fh.setFormatter(sf);
//         } catch (Exception e) {
//             e.printStackTrace();
//             logger.warning("Ошибка записи в файл.");
//         }
//     }

//     static void writeArrayToFile(String[] arr, String fileName){    // метод, который запишет массив, возвращенный предыдущим методом в файл
//         try (FileWriter fw = new FileWriter(fileName)){
//             for (String elem : arr) {
//                 fw.write(elem);
//                 fw.write(System.lineSeparator());  // перенос строки
//             }
//             logger.info("Данные успешно записаны.");
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }