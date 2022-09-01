public class Television {

  String brand; // brand name
  int volume;    // current volume

  void turnOn () {
    System.out.println("Turning on your " + brand + " TV to volume " + volume);
  }

  void turnOff() {
    System.out.println("Shutting down " + brand + " TV, goodbye ");
  }
}
