package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson2 {

  // 1. Метод printThreeWords()
  public static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

  // 2. Метод checkSumSign()
  public static void checkSumSign() {
    int a = 5;
    int b = -3;
    int sum = a + b;

    if (sum >= 0) {
      System.out.println("Сумма положительная");
    } else {
      System.out.println("Сумма отрицательная");
    }
  }

  // 3. Метод printColor()
  public static void printColor() {
    int value = 75;

    if (value <= 0) {
      System.out.println("Красный");
    } else if (value <= 100) {
      System.out.println("Желтый");
    } else {
      System.out.println("Зеленый");
    }
  }

  // 4. Метод compareNumbers()
  public static void compareNumbers() {
    int a = 10;
    int b = 20;

    if (a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }
  }

  // 5. Главный метод main() для вызова всех методов
  public static void main(String[] args) {
    System.out.println("--- Метод printThreeWords() ---");
    printThreeWords();

    System.out.println("\n--- Метод checkSumSign() ---");
    checkSumSign();

    System.out.println("\n--- Метод printColor() ---");
    printColor();

    System.out.println("\n--- Метод compareNumbers() ---");
    compareNumbers();
  }
}