package homeworkweek2;


import java.util.Scanner;

/*Write a programme for a calculator with addition,subtraction,multiplication and division
 *methods all with parameters and use string concatenation methods.
 * (Note : Two static and Two instance methods.)
 */
public class Programme_5 {
    //static methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }

    public static int substraction(int a, int b) {
        return a - b;

    }

    //instance method
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);

    }

    public int division(int a, int b) {
        return a / b;
    }

    //Declare main method
    public static void main(String[] args) {
        //Scanner declaration for reading input form colsole
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter First Number : ");
        int a = Scan.nextInt();
        System.out.println("Please enter Second Number : ");
        int b = Scan.nextInt();

        addition(a, b);

        int subresult = substraction(a, b);
        System.out.println("The substraction of " + a + " and " + b + " is : " + subresult);

        Programme_5 programme_5 = new Programme_5();
        programme_5.multiplication(a, b);

        int divresult = programme_5.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divresult);
        //closing the scanner object


        Scan.close();
    }
}
