//------------------------------------------------------------------
// Напишите программу, запрашивающую имя в консоли

// package Seminars;

// import java.util.Scanner;

// public class Sem1 {
//     public static void main(String[] args) {
//         task0();
//     }
//     static void task0(){
//         System.out.println("Как тебя зовут? ");
//         Scanner scanner = new Scanner(System.in);
//         String name = scanner.nextLine();
//         System.out.println("Привет, " + name);
//     }
// }

//------------------------------------------------------------------
// та же самая программа, только с запросом времени 

// package Seminars;

// import java.time.LocalTime;
// import java.util.Scanner;

// public class Sem1 {
//     public static void main(String[] args) {
//         task0();
//     }
//     static void task0(){
//         System.out.println("Как тебя зовут? ");
//         Scanner scanner = new Scanner(System.in);
//         String name = scanner.nextLine();
//         LocalTime localTime = LocalTime.now(); // переменная локального времени
//         int hour = localTime.getHour();
//         if (hour >= 5 && hour < 12) System.out.println("Доброе утро " + name);
//         else if (hour < 18) System.out.println("Добрый день " + name);
//         else if (hour < 23) System.out.println("Добрый вечер " + name);
//         else System.out.println("Доброй ночи " + name);
//     }
// }

//------------------------------------------------------------------
// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

// package Seminars;

// public class Sem1 {
//     public static void main(String[] args) {
//         task0();
//     }
//     static void task0(){
//         int[] arr = {1, 1, 0, 1, 1, 1};
//         int count = 0;
//         int maxOnes = 0;

//         for (int i = 0; i < arr.length; i++){
//             if (arr[i] == 1) count ++;
//             else count = 0;
//                 if (count > maxOnes){
//                     maxOnes = count;
//                 }
//             }
//         System.out.println(maxOnes);
//     }
// }
//------------------------------------------------------------------
// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.

// package Seminars;

// import java.util.Arrays;

// public class Sem1 {
//     public static void main(String[] args) {
//         task0();
//     }
//     static void task0(){
//         int[] nums = {3, 2, 2, 3};
//         int val = 3;
//         int current = 0;
//         int[] tempArr = new int[nums.length];
//         Arrays.fill(tempArr, val);
//         for (int i = 0; i < nums.length; i++) {
//             if(nums[i] != val){
//                 tempArr[current++] = nums[i];
//             }
//         }
//         System.out.println(Arrays.toString(tempArr));
//     }
// }
//------------------------------------------------------------------
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

// package Seminars;

// public class Sem1 {
//     public static void main(String[] args) {
//         task0("Добро пожаловать на курс по Java");
//     }
//     static void task0(String str){
//         str = str.toLowerCase();
//         String[] strArr = str.split(" ");
//         for (int i = strArr.length - 1; i >= 0; i--) {
//             System.out.print(strArr[i] + " ");
//         }
//     }
// }