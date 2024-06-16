// Дано четное число N (>0) и символы с1 и с2
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов с1 и с2, начиная с с1.

// public class Sem2 {
//     public static void main(String[] args) {
//        int n = 8;
//        char c1 = 'G';
//        char c2 = 'b';

//        // обычный метод String:
//        System.out.println(getStr(n, c1, c2));
//        // метод stringBuilder:
//        System.out.println(getStrBuild(n, c1, c2));

//     }
//     public static String getStr(int n, char c1, char c2) {
//         String str = "";

//         for (int i = 0; i < n/2; i++) {
//             str += Character.toString(c1) + Character.toString(c2);     // преобразование символов в строку
//         }
//         return str;
//     }

//     public static String getStrBuild(int n, char c1, char c2) {
//         StringBuilder sb = new StringBuilder(n);

//         for (int i = 0; i < n/2; i++) {
//             sb.append(c1).append(c2);
//         }
//         return sb.toString();       // преобразование символов в строку
//     }
// }
//------------------------------------------------------------------------
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd
// Результат: a4b3c1d2

// public class Sem2 {
//     public static void main(String[] args) {
//         String s = "aaaabbbcdd";
//         System.out.println(compressPack(s));
//     }

//     public static String compressPack(String s) {
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         char x = s.charAt(0);
//         for (int i = 1; i < s.length(); i++) {
//             if (s.charAt(i) == x)
//                 count++;
//             else {
//                 sb.append(x).append(count);
//                 count = 1;
//                 x = s.charAt(i);
//             }
//         }
//         sb.append(x).append(count);
//         return sb.toString();
//     }
// }
//------------------------------------------------------------------------
// Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).

// public class Sem2 {
//     public static void main(String[] args) {
//         String s = "шалаш";
//         System.out.println(strBack(s));
//     }

//     public static boolean strBack(String s) {
//         for (int i = 0, k = s.length() - 1; i < k; i++, k--) {
//             if (s.charAt(i) != s.charAt(k))
//                 return false;
//         }
//         return true;
//     }
// }
//------------------------------------------------------------------------
// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения

// import java.io.FileWriter;

// public class Sem2 {
//     public static void main(String[] args) {
//         String resStr = fillString("TEST", 10);
//         writeToFile(resStr, "sem2.txt");
//     }

//     public static String fillString(String s, int count) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i <= count; i++) {
//             sb.append(s).append(" ");
//         }
//         return sb.toString();
//     }

//     public static void writeToFile(String resStr, String fileName) {
//         try (FileWriter fileWriter = new FileWriter(fileName)){
//             fileWriter.write(resStr);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
//------------------------------------------------------------------------
// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
// оно должно записаться в лог файл.
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Sem2 {
//     public static void main(String[] args) {

//     }

//     public static String[] getContentFolder(String folder) {
//         File folder = new File(folderName);
//         return folder.list()
//     }

//     public static void writeArrayToFile(String[] arr, String fileName) {
//         try(FileWriter fileWriter = new FileWriter(fileName)){
//             if (arr == null) return;
//             for (int i = 0; i < arr.length; i++) {
//                 fileWriter.write(arr[i]);
//                 fileWriter.write(System.lineSeparator());
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
    
// }