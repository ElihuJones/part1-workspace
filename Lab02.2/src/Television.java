public class Television {

  private String brand; // brand name

  private int volume;   // current volume

  // Model/Business Methods --> public methods
  public void turnOn () {
    boolean isConnected = verifyInternetConnection();
    System.out.println("Turning on your " + brand + " TV to volume " + volume);
  }

  public void turnOff() {
    System.out.println("Shutting down " + brand + " TV, goodbye ");
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  //Helper Methods --> private methods
  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "Television: brand = " + brand + ", volume = " + volume;
  }
}
