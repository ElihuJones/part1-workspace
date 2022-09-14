package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private double rate; //field
  private double hours;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee (String name, LocalDate hireDate, double rate, double hours) {
    this(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
//    return super.toString() +
//        ", rate = " + rate +
//        ", hours = " + hours;
      return  String.format("%s, rate=%,.2f, hours=%,.2f", super.toString(), getRate(), getHours());
  }

  //All this needs to be done for Hourly and Salaried
  // todo pg 109 declare and implement a constructor that takes time, hireDate, rate, and hours as parameter

  //todo generate setters and getters for rate and hours

  // todo override toString

  //todo

}
