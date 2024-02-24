// Внутри класса Answer напишите метод countNTriangle, 
// который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.
// n = 4 -> 10

// package HomeWorks;

// public class Hw1 {
// // int n = 4;
//     public static void main(String[] args) {
//         countNTriangle(0);
//     }
//     static void countNTriangle(int x){
//         if (x < 1) System.out.println("-1");
//         else {
//             int i = 1;
//             int count = 0;
//             while (i <= x) {
//                 count += i;
//                 i++;
//             }
//         System.out.println(count);
//         }
//     }
// }

//------------------------------------------------------------------
// Напишите функцию printPrimeNums, 
// которая выведет на экран все простые числа в промежутке от 1 до 1000, 
// каждое на новой строке.

// package HomeWorks;

// public class Hw1 {
// // int n = 4;
//     public static void main(String[] args) {
//         printPrimeNums(1000);
//     }
//     static void printPrimeNums(int x){
//         int i,j;
//         boolean cheker;

//         for (i = 2; i <= 1000; i++) {
//             cheker = true;
//             for (j = 2; j < i; j++) {
//                 if ((i % j) == 0){
//                     cheker = false;
//                 }
//             }
//         if (cheker) System.out.println(i);
//         }
//     }
// }


//------------------------------------------------------------------
// В методе calculate класса Calculator реализовать калькулятор, 
// который будет выполнять математические операции (+, -, *, /) 
// над двумя целыми числами и возвращать результат вещественного типа.

// В классе Printer необходимо реализовать проверку переданного оператора,
// при некорректном операторе программа должна вывести сообщение об ошибке 
// "Некорректный оператор: 'оператор'".

// package HomeWorks;

// class Calculator {
//     public float calculate(char op, int a, int b) {
//       float res = 0;
//       if (op == '+') res = a + b;
//       else if (op == '-') res = a - b;
//       else if (op == '*') res = a * b;
//       else if (op == '/') res = a / b;
//       return res;
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Hw1{ 
//     public static void main(String[] args) { 
//         int a = 0;
//         char op = ' ';
//         int b = 0;

//         if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             a = 3;
//             op = '-';
//             b = 7;
//         } else {
//             a = Integer.parseInt(args[0]);
//             op = args[1].charAt(0);
//             b = Integer.parseInt(args[2]);
//         }

//         Calculator calculator = new Calculator();
//         float result = calculator.calculate(op, a, b);
//         if (op == '+'|| op == '-' || op == '*' || op == '/'){
//             System.out.println(result);
//         }
//         else {
//             System.out.println("Некорректный оператор: "+ op);
//         }
//     }
// }