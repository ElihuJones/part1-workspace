import java.sql.SQLOutput;

public class TelevisionValidationTest {

  public static void main(String[] args) {

    //Validation Testing Parameters
    Television tv1 = new Television();
    tv1.setVolume(0);
    System.out.println(tv1);

    tv1.setVolume(100);
    System.out.println(tv1);

    tv1.setVolume(-1);
    System.out.println(tv1);
    tv1.setVolume(101);
    System.out.println(tv1);


  }

}
