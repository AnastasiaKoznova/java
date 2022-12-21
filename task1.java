package lesson1;
 /**
  * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
  * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”+
  */
public class task1 {public static boolean expressionCheck(int a, int b) {
    return a >= 10 && b <= 20;}



    /**
     * * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    public static void checkPositiveNegative (int a) {

        System.out.println(a >= 0 ? "Positive/n" : "Negative/n");
    }



     /**
      * Написать метод, которому в качестве аргументов передается строка и число,
      * метод должен отпечатать в консоль указанную строку, указанное количество раз.
      */
     public static void printWordNTimes(String str, int n){
         for (int i = 1; i <= n; i++)
             System.out.println("[" + i + "]" + str);
         }

     /**Написать метод, которому в качестве параметра передается целое число.
      * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
      */
     public static boolean checkNegative(int a){

         return a < 0;
     }

     /**Задать целочисленный массив, состоящий из элементов 0 и 1.
      * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
      */
     private static void invertArrayVar1(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             arr[i] = (arr[i] == 1) ? 0 : 1;
         }
     }

     /**Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
      */
     public static void task2(int size) {
         int[] fillArr = new int[size];
         for (int i = 0; i < fillArr.length; i++) {
             fillArr[i] = i + 1;
             System.out.print(fillArr[i] + " ");
         }
     }

     /**Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
      */
     public static void task3(int[] multiplyOn2) {
         for (int i = 0; i < multiplyOn2.length; i++) {
             if (multiplyOn2[i] < 6) {
                 multiplyOn2[i] = multiplyOn2[i] * 2;
             }
             System.out.print(multiplyOn2[i] + " ");
         }
     }

     /**Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
      * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
      * то есть [0][0], [1][1], [2][2], …, [n][n];
      */

     public static void task4() {
         int[][] arr = new int[3][3];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                 if (i == j || i == x) arr[i][j] = 1;
                 else arr[i][j] = 0;
                 System.out.print(arr[i][j] + " ");
             }
             System.out.print("\n");
         }
     }

     /**Написать метод, принимающий на вход два аргумента: len и initialValue,
      * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
      */

     public static void task5(int len, int initialValue){
         int[] arr = new int[len];
         for (int i = 0; i < len; i++) {
             arr[i] = initialValue;
             System.out.print("[" + i + "]" + arr[i] + " ");
         }
     }

     /*** Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
      *  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. .
      */

     public static boolean checkLeapYear (int year) {
         if (year % 400 == 0) {
             return true;
         } else if (year % 100 == 0) {
             return false;
         } else {
             return year % 4 == 0;
         }

     }

 }

