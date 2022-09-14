package com.hr.personnel;

import static gov.irs.TaxPayer.HOURLY_TAX_RATE;
import static gov.irs.TaxPayer.SALARIED_TAX_RATE;

import gov.irs.TaxPayer;
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
//Business methods behaviors
  public void pay() {
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(),getHours() * getRate());
    // %s is getName(),  %,.2f is product of getHours() and getRate()
  }
  @Override
  public void payTaxes() {
    double taxes = getHours() * HOURLY_TAX_RATE * getRate();    //Lab 9.1 Addition
    System.out.println(getName() + " paid taxes of" + taxes);
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
    return super.toString() +               // string concatenation
        ", rate = " + rate +
        ", hours = " + hours;
    //      string formatting
    //      return  String.format("%s, rate=%,.2f, hours=%,.2f", super.toString(), getRate(), getHours());
  }

}
