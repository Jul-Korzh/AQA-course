package org.example;

public class Lesson4 {

  public static void main(String[] args) {

    Employee[] persArray = new Employee[5];

    persArray[0] = new Employee("Иванов Иван Иванович", "Инженер",
        "ivanov@mailbox.com", "892312312", 50000, 45);
    persArray[1] = new Employee("Петров Петр Петрович", "Менеджер",
        "petrov@mailbox.com", "892312313", 60000, 35);
    persArray[2] = new Employee("Сидорова Анна Сергеевна", "Бухгалтер",
        "sidorova@mailbox.com", "892312314", 55000, 42);
    persArray[3] = new Employee("Кузнецов Алексей Викторович", "Программист",
        "kuznetsov@mailbox.com", "892312315", 80000, 28);
    persArray[4] = new Employee("Смирнова Ольга Дмитриевна", "Директор",
        "smirnova@mailbox.com", "892312316", 100000, 50);

    System.out.println("Сотрудники старше 40 лет:");

    for (Employee employee : persArray) {
      if (employee.getAge() > 40) {
        employee.printInfo();
      }
    }

    Park centralPark = new Park("Центральный парк", "ул. Центральная, 1");

    centralPark.addAttraction("Колесо обозрения", "10:00-22:00", 300);
    centralPark.addAttraction("Американские горки", "11:00-20:00", 500);
    centralPark.addAttraction("Карусель", "10:00-19:00", 150);
    centralPark.addAttraction("Комната страха", "12:00-23:00", 350);

    centralPark.displayAttractionsInfo();
  }
}
