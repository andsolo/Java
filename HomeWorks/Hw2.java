// 📌 Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. 
// Если значение null, то параметр не должен попадать в запрос.

// public class Hw2 {

//     public static void main(String[] args) {
//         String QUERY = "select * from students where ";
// 	    String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//         //               {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//         //               select * from students where name='Ivanov' and country='Russia' and city='Moscow'
//         System.out.print(answer(QUERY, PARAMS));
//     }

//     public static StringBuilder answer(String QUERY, String PARAMS){
//         StringBuilder sb = new StringBuilder(QUERY);
//         PARAMS = PARAMS.trim(); // {\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}
//         PARAMS = PARAMS.substring(1, PARAMS.length() - 1); // \"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"
//         System.out.println(PARAMS);
//         //PARAMS = PARAMS.replace("\"", ""); // name:Ivanov, country:Russia, city:Moscow, age:null
//         //System.out.println(PARAMS);

//         String[] keys = PARAMS.split(",");
        
//         for (int i = 0; i < keys.length; i++) {
//             String[] words = keys[i].split(":");
//             if (!words[1].equals("\"null\"")) {
//                 sb.append(i != 0 ? " and" : "");
//                 sb.append(words[0].replace("\"", ""));
//                 sb.append('=');
//                 sb.append(words[1].replace("\"", "'"));
//             }
//         }
//         return sb;
//     }
// }
//-------------------------------------------------------------------
// 📌 Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Arrays;

// class BubbleSort {
//     private static File log;
//     private static FileWriter fileWriter;

//     public void sort(int[] mas) throws IOException {
//         log = new File("log.txt");
//         fileWriter = new FileWriter(log);
//         boolean sorted = false;
//         while (!sorted) {
//             sorted = true;
//             for (int i = 0; i < mas.length - 1; i++) {
//                 if (mas[i] > mas[i + 1]) {
//                     int temp = mas[i + 1];
//                     mas[i + 1] = mas[i];
//                     mas[i] = temp;
//                     sorted = false;
//                 }
//             }
//             LocalDateTime dateTimeNow = java.time.LocalDateTime.now();
//             String dtnForm = dateTimeNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
//             String line = String.format("%s %s", dtnForm, Arrays.toString(mas));
//             fileWriter.write(line);
//             fileWriter.append(System.lineSeparator());
//         }
//         fileWriter.flush();
//     }
// }
// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
//       int[] arr = {};
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         arr = new int[]{9, 4, 8, 3, 1};
//       }
//       else{
//         arr = Arrays.stream(args[0].split(", "))
//                         .mapToInt(Integer::parseInt)
//                         .toArray();
//       }     
      
//       BubbleSort ans = new BubbleSort();      
//       ans.sort(arr);

//       try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }