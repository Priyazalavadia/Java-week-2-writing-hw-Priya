package homeworkweek2;
/* Write a Java programme using the following steps.
*3.1 Declare one instance and one static variables.
*3.2 Declare one instance method.
*3.3 Declare one static method.
*3.4 Call both instance and static variable into both instance and static methods inside the print statement
* 3.5 Declare the Main Method.
* 3.6 Call both instance and static methods into the main method and run the programme.

 */

public class Programme_3 {
    //3.1 Declare one instance and one static variable.
    String name = "Priya";
    static String Surname = "Zalavadia";

    //Declare one instance method
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Programme_3.Surname);
    }

    public static void  staticMethod() {
        Programme_3 programme_3=new Programme_3();
        System.out.println(programme_3.name);
        System.out.println(Surname);
    }
    // Declare the Main method.
    // Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_3 programme_3=new Programme_3();
        programme_3.instanceMethod();
        staticMethod();

    }

}
