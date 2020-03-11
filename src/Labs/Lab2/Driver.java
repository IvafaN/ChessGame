package Labs.Lab2;

public class Driver {
    public static void main(String[] args) {
        // Lastly, create a Driver class to run your code in the main method.   // DONE
        // Create an instance(object) of a Canada called canada.                // DONE
        // Canada canada = new Canada();                                        // DONE
        Canada canada = new Canada();

        // Call displayAllProvinces() to display all provinces’ info.           // DONE
        // canada.displayAllProvinces();                                        // DONE
        canada.displayAllProvinces();

        // Call System.out.println(canada.getNumOfProvincesBetween(1, 15));     //
        System.out.println(canada.getNumOfProvincesBetween(1,15));
        // Your result should be 6.                                             //
    }
}