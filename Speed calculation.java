/* Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804 */

import java.util.Scanner;	//importing scanner class
public class Main
{
  public static void main (String[]args)
  {

    // input from user

    Scanner sc = new Scanner (System.in);
    double distanceInMeters = sc.nextDouble ();
    double hour = sc.nextDouble ();
    double minutes = sc.nextDouble ();
    double seconds = sc.nextDouble ();

    // Computation code

    //double meterPerSecond = ;
      System.out.println ("meter per second is...." +
			  (distanceInMeters /
			   ((5 * 60 * 60) + (56 * 60) + seconds)));
    //      double kilometerPerHour = ;
      System.out.println ("kilometer per hour is ..." +
			  ((distanceInMeters / 1000) /
			   (hour + (minutes / 60) + (seconds / (60 * 60)))));
    //double milesPerHour = ;
      System.out.println ("mile per hour is..." +
			  ((distanceInMeters / 1609) /
			   (hour + (minutes / 60) + (seconds / (60 * 60)))));
  }
}
