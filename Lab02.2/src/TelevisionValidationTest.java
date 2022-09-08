//In this class I will write code that test both positive and negative values and see if
//the program meets expectations.
public class TelevisionValidationTest {

  //Can have more than one main method, but only one per class
  public static void main(String[] args) {

    //Validation Testing Parameters
    Television tv1 = new Television();

    tv1.setBrand("Sony");
    System.out.println(tv1.getBrand()); //Should print Sony

    tv1.setBrand("LG");
    System.out.println(tv1.getBrand()); //Should print LG

    tv1.setBrand("Zeneith");
    System.out.println(tv1.getBrand()); //Should print out error message and LG due to unchanged.

    tv1.setBrand("Vizio");
    System.out.println(tv1.getBrand()); //Should print out error message and LG due to unchanged.

    tv1.setVolume(Television.MIN_VOLUME);
    System.out.println(tv1.getVolume()); //The getter should retrieve and print 0.

    tv1.setVolume(Television.MAX_VOLUME);
    System.out.println(tv1.getVolume()); //The getter should retrieve and print 100.

    tv1.setVolume(Television.MIN_VOLUME - 1); //Should print error and 100 unchanged.
    System.out.println(tv1.getVolume());

    tv1.setVolume(Television.MAX_VOLUME + 1); //Should print error and 100 unchanged.
    System.out.println(tv1.getVolume());


  }

}
