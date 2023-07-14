/*write a program to accept Radius from the user and calculate Area of circle & Circumference of circle in java*/
package assignment;

public class Assignment {
	 public static void main(String args[])
	  {
	    int radius = 3;
	    double area = Math.PI * (radius * radius);
	    System.out.printf("Area is: %.2f", area);

	    double circumference= Math.PI * 2*radius;
	    System.out.printf( "\nCircumference is: %.2f",circumference) ;
	  }
}
