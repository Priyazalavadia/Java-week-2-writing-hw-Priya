package homeworkweek2;

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter the length of the Triangle :");
        int length = Scan.nextInt();
        System.out.println("Please enter the height of the Triangle :");
        int height = Scan.nextInt();
        areaOfTriangle(height, length);
    }

    private static void areaOfTriangle(int height, int length) {
        int area=(length * height) / 2;
        System.out.println("The Area of a Triangle is : " + area);
    }

}
