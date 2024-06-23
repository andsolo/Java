// Кллекции JAVA 
// «Удобный массив» Разные способы создания
// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);

// Коллекции. Row Type
// import java.util.ArrayList;
// import java.util.List;

// public class Ex002_ArrayList {
//     public static void main(String[] args) {
//         List list = new ArrayList();
//         list.add(2809);
//         list.add("string line");
//         for (Object o : list) {
//             System.out.println(o);
//             // Проблема извлечения данных
//         }
//     }
// }

// Коллекции. Save Type
// import java.util.ArrayList;
// import java.util.List;

// public class Ex002_ArrayList {
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         list.add(123);
//         // list.add("string line");
//         for (Object o : list) {
//             System.out.println(o);
//         }
//         // Проблема извлечения данных
//     }
// }

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end
// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col 
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type 
// List.copyOf(col) – возвращает копию списка на основе имеющегося 
// List.of(item1, item2,...) – возвращает неизменяемый список