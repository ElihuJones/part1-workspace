package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {

  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Sony");
    tv1.setVolume(25);

    tv1.turnOn();
    tv1.turnOff();

    System.out.printf("%d television instances createdd%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony");
    tv2.setBrand("Samsung");
    tv2.setVolume(32);

    tv2.turnOn();
    tv2.turnOff();

    Television tv = new Television("Sony", 40);
    System.out.println(tv);

    System.out.printf("%d television instances createdd%n", Television.getInstanceCount());

    System.out.println(tv1.toString()); //These two lines are identical
    System.out.println(tv2);

    Television tv3 = new Television("LG");
    System.out.println(tv3);
    System.out.printf("%d television instances createdd%n", Television.getInstanceCount());
  }
}
