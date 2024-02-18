// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    // точка входа
//         System.out.println("initial");        // вывод
//     }
// }


// Типы данных бывают ссылочные и примитивные.
// примитивные - boolean, int, short, long, float, double, char и тд
// ссылочные - массивы, списки и тд

//------------------------------------------------------------------
//              работа с массивами

// Пример синтаксического определения одномерного массива:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int [] arr = new int [10];
//         System.out.println(arr.length);

//         arr = new int[] {1, 2, 3, 4, 5};
//         System.out.println(arr.length);
//     }
// }


// Пример синтаксического определения многомерного массива:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int [] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

//------------------------------------------------------------------
//              Получение данных из терминала:

// package Lectures;

// import java.util.Scanner;
// public class Lec1 {
//     public static void main(String[] args) {    
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

//------------------------------------------------------------------
//              Форматированный вывод:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }

//------------------------------------------------------------------
//              Функции (методы):

// package Lectures;

// public class Lec1 {
//     public static void sayHi() {
//         System.out.println("hi!");
//     }
//     public static int sum(int a, int b) {
//         return a+b;
//     }
//     public static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }

//------------------------------------------------------------------
//              Управляющие конструкции, условынй оператор:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a; 
//         } else {
//             c = b; }
//         System.out.println(c);
//         // или более компактно:

//         // int a = 1;
//         // int b = 2;
//         // int c = 0;
//         // if (a > b) c = a;
//         // if (b > a) c = b;
//         // System.out.println(c);
//     }
// }
//--------------
// Тернарный оператор:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }

//------------------------------------------------------------------
//              Оператор выбора:

// package Lectures;

// import java.util.Scanner;
// public class Lec1 {
//     public static void main(String[] args) {    
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             ...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

//------------------------------------------------------------------
//              Циклы:
// Цикл — это многократное выполнение одинаковой последовательности действий.

// В java доступны следующие циклы:
// - цикл while;
// - цикл do while;
// - цикл for; и его модификация for in

//--------------
// цикл while:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//     System.out.println(count);
//     }
// }

//--------------
// цикл do while:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int value = 321;
//         int count = 0;
//         do{
//             value /= 10;
//             count++;
//         }
//         while (value != 0);
//     System.out.println(count);
//     }
// }

//--------------
// цикл for:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//         s += i; 
//         }
//         System.out.println(s);
//     }
// }
//--------------
// Вложенные циклы:

// package Lectures;

// public class Lec1 {
//     public static void main(String[] args) {    
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }