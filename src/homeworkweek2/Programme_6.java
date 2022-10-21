package homeworkweek2;

import java.util.Scanner;

/*write a programme to enter any radius value of the circle and find out the area. (Formula of Area A-PI*r*r)
 */
public class Programme_6 {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = Scan.nextDouble();
        areaOfCircle(radius);

        //closing the scanner object
        Scan.close();
    }
        //Calculating the area of circle
        private static void areaOfCircle(double radius) {
            double pi = Math.PI;
            double area = (pi * radius * radius);
            System.out.println("The Area of Circle is : " + area);
        }


    }



