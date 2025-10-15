package org.example;

public class Park {

  private final String name;
  private final String location;
  private Attraction[] attractions;

  public Park(String name, String location) {
    this.name = name;
    this.location = location;
    this.attractions = new Attraction[0];
  }

  public void addAttraction(String name, String workTime, double price) {
    Attraction[] newAttractions = new Attraction[attractions.length + 1];
    System.arraycopy(attractions, 0, newAttractions, 0, attractions.length);
    newAttractions[attractions.length] = new Attraction(name, workTime, price);
    attractions = newAttractions;
  }

  public void displayAttractionsInfo() {
    System.out.println("Парк: " + name);
    System.out.println("Местоположение: " + location);
    System.out.println("Аттракционы:");
    System.out.println("------------------------");

    for (Attraction attraction : attractions) {
      attraction.displayInfo();
    }
  }

  static class Attraction {

    private final String attractionName;
    private final String workTime;
    private final double price;

    public Attraction(String attractionName, String workTime, double price) {
      this.attractionName = attractionName;
      this.workTime = workTime;
      this.price = price;
    }

    public void displayInfo() {
      System.out.println("Название: " + attractionName);
      System.out.println("Время работы: " + workTime);
      System.out.println("Стоимость: " + price + " руб.");
      System.out.println("------------------------");
    }

    public String getAttractionName() {
      return attractionName;
    }

    public String getWorkTime() {
      return workTime;
    }

    public double getPrice() {
      return price;
    }
  }
}
