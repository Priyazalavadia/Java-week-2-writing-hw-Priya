package homeworkweek2;
/*Write a Java programme using the following steps.
*4.1 Declare two instance and two static variables.
*4.2 Declare one instance method.
* 4.3 Declare one static method.
* 4.4 call all four instance and static variables into both instance and static methods inside the print statement.
* 4.5 Declare the Main Method.
* 4.6 Call both instance and static methods into the main method and run the programme.
 */
public class Programme_4 {
    //Declare two instance and two static variables.
    //instance variable
    String name = "Priya";
    String Surname = "Zalavadia";
    //Static variable
    static boolean a = true;
    static boolean b = false;

// Declare one instance method
    // Call all four instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Surname);
    }
        //Declare one static method
        // Call all four instance and static variables into both instance and static methods inside the print statement.

        public static void  staticMethod() {
            Programme_4 programme_4=new Programme_4();
            System.out.println(programme_4.name);
            System.out.println(programme_4.Surname);
            System.out.println(a);
            System.out.println(b);
        }

        //Declare main method
        //Call boh instance and static method into the main method

    public static void main(String[] args) {
        Programme_4 programme_4=new Programme_4();
        programme_4.instanceMethod();
        staticMethod();

    }

    }


