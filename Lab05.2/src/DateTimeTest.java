/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;
import java.util.Date;
import jdk.jshell.execution.LocalExecutionControl;

class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {

        testNow();
         testCreate();
         testParse();
         testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println("LocalDateTime : " + timestamp);

        LocalDate date = LocalDate.now();
        System.out.println("Local Date is : " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Local Time is : " + time);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        LocalDate bday = LocalDate.of(1979, 11,12);
        System.out.println("My Birthday is: " + bday);

        // NOTE: ignore time-zone, just assume Eastern Time is the local time.
        LocalDateTime landing = LocalDateTime.of(1969, 7, 20, 15, 18);
        System.out.println(landing);

    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
        LocalDate birthday = LocalDate.parse("1963-12-17");
        System.out.println(birthday);

        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        birthday = LocalDate.parse("12/17/1963", formatter);
        System.out.println(birthday);
    }


    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(usDateFormat.format(hastings));
        DateTimeFormatter intlFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(intlFormat.format(hastings));

        // TODO: 10/14/1066
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("MM d, yyyy");
        System.out.println(longFormat.format(hastings));
    }
}