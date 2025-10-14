package org.example;

import java.util.Arrays;

public class Lesson3 {

  // 1. Метод проверки суммы в диапазоне от 10 до 20
  public static boolean checkSumRange(int a, int b) {
    int sum = a + b;
    return sum >= 10 && sum <= 20;
  }

  // 2. Метод проверки положительное или отрицательное число
  public static void checkNumberSign(int number) {
    if (number >= 0) {
      System.out.println(number + " - положительное число");
    } else {
      System.out.println(number + " - отрицательное число");
    }
  }

  // 3. Метод возвращает true если число отрицательное
  public static boolean isNegative(int number) {
    return number < 0;
  }

  // 4. Метод печатает строку указанное количество раз
  public static void printStringMultipleTimes(String str, int count) {
    for (int i = 0; i < count; i++) {
      System.out.println(str);
    }
  }

  // 5. Метод проверки високосного года
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  // 6. Метод инвертирования массива из 0 и 1
  public static void invertArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (array[i] == 0) ? 1 : 0;
    }
  }

  // 7. Метод заполнения массива числами от 1 до 100
  public static int[] fillArray1To100() {
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    return array;
  }

  // 8. Метод умножения чисел меньше 6 на 2
  public static void multiplyLessThan6(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 6) {
        array[i] *= 2;
      }
    }
  }

  // 9. Метод заполнения диагоналей единицами
  public static void fillDiagonals(int[][] matrix) {
    int size = matrix.length;
    for (int i = 0; i < size; i++) {
      matrix[i][i] = 1; // главная диагональ
      matrix[i][size - 1 - i] = 1; // побочная диагональ
    }
  }

  // 10. Метод создания массива с заданным значением
  public static int[] createArray(int len, int initialValue) {
    int[] array = new int[len];
    Arrays.fill(array, initialValue);
    return array;
  }

  // Метод для печати массива
  public static void printArray(int[] array) {
    System.out.println(Arrays.toString(array));
  }

  // Метод для печати двумерного массива
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
  }

  public static void main(String[] args) {
    System.out.println("--- 1. Проверка суммы в диапазоне 10-20 ---");
    System.out.println("Сумма 5 и 10: " + checkSumRange(5, 10)); // true
    System.out.println("Сумма 5 и 5: " + checkSumRange(5, 5));   // false

    System.out.println("\n--- 2. Проверка знака числа ---");
    checkNumberSign(10);   // положительное
    checkNumberSign(-5);   // отрицательное
    checkNumberSign(0);    // положительное

    System.out.println("\n--- 3. Проверка отрицательное ли число ---");
    System.out.println("10: " + isNegative(10));   // false
    System.out.println("-5: " + isNegative(-5));   // true
    System.out.println("0: " + isNegative(0));     // false

    System.out.println("\n--- 4. Печать строки несколько раз ---");
    printStringMultipleTimes("Hello", 3);

    System.out.println("\n--- 5. Проверка високосного года ---");
    System.out.println("2020: " + isLeapYear(2020)); // true
    System.out.println("2021: " + isLeapYear(2021)); // false
    System.out.println("1900: " + isLeapYear(1900)); // false
    System.out.println("2000: " + isLeapYear(2000)); // true

    System.out.println("\n--- 6. Инвертирование массива ---");
    int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    System.out.print("До: ");
    printArray(array1);
    invertArray(array1);
    System.out.print("После: ");
    printArray(array1);

    System.out.println("\n--- 7. Заполнение массива 1-100 ---");
    int[] array2 = fillArray1To100();
    System.out.println("Первые 10 элементов: " +
        Arrays.toString(Arrays.copyOf(array2, 10)));

    System.out.println("\n--- 8. Умножение чисел < 6 на 2 ---");
    int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.print("До: ");
    printArray(array3);
    multiplyLessThan6(array3);
    System.out.print("После: ");
    printArray(array3);

    System.out.println("\n--- 9. Заполнение диагоналей матрицы ---");
    int[][] matrix = new int[5][5];
    fillDiagonals(matrix);
    printMatrix(matrix);

    System.out.println("\n--- 10. Создание массива с заданным значением ---");
    int[] array4 = createArray(5, 7);
    System.out.print("Массив: ");
    printArray(array4);
  }
}
