package com.entertainment;

public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;           //Fields
  private String brand; // brand name
  private int volume;   // current volume level

  private DisplayType display = DisplayType.LED;

  public Television() { //Constructor
    instanceCount++;
  }

  public Television(String brand) { //Constructor
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {  //Constructor
    this(brand);
    setVolume(volume);
  }
  public Television(String brand, int volume, DisplayType display) { //Constructor
    this(brand, volume);
    setDisplay(display);
  }

  // Model/Business Methods --> public methods
  public void turnOn () {
    boolean isConnected = verifyInternetConnection();
    System.out.println("Turning on your " + brand + " TV to volume " + volume);
  }

  public void turnOff() {
    System.out.println("Shutting down " + brand + " TV, goodbye ");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  //Getters and Setters
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    if (brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba")) {
      this.brand = brand;
    } else {
      System.out.printf("%s This is NOT a valid brand. %n", brand);
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume, MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  public DisplayType getDisplay() {
    return display;
  }
  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  //Helper Methods --> private methods
  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "com.entertainment.Television: brand = " + brand + ", volume = " + volume + " display = " + display;
  }
}
