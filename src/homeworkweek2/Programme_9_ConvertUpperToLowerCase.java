package homeworkweek2;

/*write a programme to convert the upper case to lower case.
 */


import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the uppercase String: ");
        String uppercase = Scan.nextLine();
        Programme_9_ConvertUpperToLowerCase obj = new Programme_9_ConvertUpperToLowerCase();


        obj.convertUppercaseToLowerCase(uppercase);
        // closing the scanner object
        Scan.close();
    }

    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }

}
