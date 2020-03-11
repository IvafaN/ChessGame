package Lab1;

public class Drive {
    public static void main(String[] args) {
        Model m1 = new Model("Susan", "Smith", 70, 120, false, true);
        // Name: Susan Smith
        // Height: 70 inches
        // Weight: 120.0 pounds
        // Doesn't travel
        // Does smoke
        m1.printDetails();
        System.out.println();

        Model m2 = new Model("Susan", "Smith", 10, 120, true, false);
        // Displays all the model's information on the screen. It must invoke(call) methods defined.
        // Example display:
        // Name: Susan Smith        // DONE
        // Height: 5 feet 10 inches //
        // Weight: 120.0 pounds     // DONE
        // Travels: yep             // DONE
        // Smokes: nope             // DONE
        // Hourly rate: $69         // DONE
        m2.setHeight(6,3);
        m2.printDetails();
        m2.displayModelDetails();
    }
}