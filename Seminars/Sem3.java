// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() и вывести его на экран.

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;

// public class Sem3 {
//     public static void main(String[] args) {
//         ArrayList <Integer> randomList = new ArrayList<>();
//         Random rnd = new Random();
//         for (int i = 0; i < 10; i++) {
//             randomList.add(rnd.nextInt(0,100));
//         }
//     System.out.println("До сортировки: " + randomList);
//     Collections.sort(randomList);
//     System.out.println("После" + randomList);
//     }
// }
//-------------------------------------------------------------------
// 📌 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его повторений в списке.
// 📌 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class Sem3 {

//     public static void main(String[] args) {
//         List<String> planets = planetsList();
//         uniquePlanetsCount(planets);
//         deleteRepeatPlanet(planets);
//         System.out.println(planets);

//     }

//     private static List<String> planetsList() {
//         List<String> planets = new ArrayList<>();
//         planets.add("Earth");
//         planets.add("Earth");
//         planets.add("Earth");
//         planets.add("Jupiter");
//         planets.add("Jupiter");
//         planets.add("Jupiter");
//         planets.add("Neptune");
//         planets.add("Neptune");
//         planets.add("Mars");
//         planets.add("Earth");
//         planets.add("Jupiter");
//         planets.add("Venus");
//         planets.add("Neptune");
//         planets.add("Saturn");
//         planets.add("Uranus");
//         planets.add("Mercury");
//         planets.add("Earth");
//         planets.add("Jupiter");
//         planets.add("Venus");
//         planets.add("Neptune");
//         planets.add("Earth");
//         planets.add("Venus");
//         return planets;
//     }

//     private static void uniquePlanetsCount(List<String> planets) {
//         List<String> sortedPlanets = new ArrayList<>(planets);
//         Collections.sort(sortedPlanets);
//         int count = 1;
//         String currentPlanet = sortedPlanets.get(0);

//         for (int i = 1; i < sortedPlanets.size(); i++) {
//             if (sortedPlanets.get(i).equals(currentPlanet)) {
//                 count++;
//             } else {
//                 System.out.println(currentPlanet + ": " + count);
//                 count = 1;
//                 currentPlanet = sortedPlanets.get(i);
//             }
//         }
//         System.out.println(currentPlanet + ": " + count);
//     }

//     private static void deleteRepeatPlanet(List<String> planets) {
//         for (int i = 0; i < planets.size(); i++) {
//             String currentPlanet = planets.get(i);
//             for (int j = planets.size() - 1; j > i; j--) {
//                 if (planets.get(j).equals(currentPlanet)) {
//                     planets.remove(j);
//                 }
//             }
//         }
//     }
// }

//-------------------------------------------------------------------
// 📌 Создать список типа ArrayList<String>.
// 📌 Поместить в него как строки, так и целые числа.
// 📌 Пройти по списку, найти и удалить целые числа.

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;
// import java.util.List;

// public class Sem3 {

//     private static boolean isInt(String str){
//         try {
//             Integer.parseInt(str);    // переводим в int
//         } catch (Exception e) {
//             return false;             // если невозможно - false
//         }
//         return true;
//     }

//     private static void deleteInt(List<String> lst){
//         for (int i = 0; i < lst.size(); i++) {
//             if (isInt(lst.get(i))){
//                 lst.remove(i);
//                 i--;
//             }
//         }
//     }

//     private static void deleteIterator(List<String> lst){
//         Iterator <String> iter = lst.iterator();
//         while (iter.hasNext()) {
//             String elem = iter.next();
//             if (isInt(elem)){
//             iter.remove();
//             }    
//         }
//     }

//     public static void main(String[] args) {
//         List <String> lst = new ArrayList<>(Arrays.asList("One", "Two", "three", "1", "2", "Привет", "-10", "Кто тут"));
//         // deleteInt(lst);
//         deleteIterator(lst);
//         System.out.println(lst);
        
//     }
// }
//-------------------------------------------------------------------
// 📌 Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. 
// Напишите метод для заполнения данной структуры.

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Sem3 {
//     public static void main(String[] args) {
//         List<ArrayList<String>> catalog = new ArrayList<>();
//         ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("genre1", "book1", "book2", "book3"));
//         ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("genre2", "book1", "book2", "book3"));
//         ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("genre3", "book1", "book2", "book3"));
//         ArrayList<String> genre4 = new ArrayList<>(Arrays.asList("genre4", "book1", "book2", "book3"));
//         catalog.addAll(Arrays.asList(genre1, genre2, genre3, genre4)); // добавляем или так

//         // catalog.add(genre1); // или же так
//         // catalog.add(genre2);
//         // catalog.add(genre3);
//         // catalog.add(genre4);

//         for (ArrayList<String> genre : catalog) {
//             System.out.println(genre);
//         }
//     }
// }