package MidTermExam;

public class Instructions {
    // The application MUST compile and run at the end.                              //
    // The only comment that is necessary is your name in the @author annotation     // DONE
    // Export the entire project (as a zip file) and upload your file from the form. // DONE
    //
    // Create the following classes:
    // Steerable interface with the following methods:      // DONE
    //  public void accelerate();                           // done
    //  public void steerLeft();                            // done
    //  public void steerRight();                           // done
    //
    // Vehicle class: Abstract class                        // done
    //  implements Steerable interface                      // done
    //  weightPounds (int type) as an instance variable.    // done
    //      The instance variable must NOT contain a
    //      negative number at any time.                    // done
    //  Constructor to initialize the instance variable.    // done
    //  Getter and setter.                                  // done
    //  Override                                            // done
    //      hashcode, equals, toString from Object class    // done
    //  Vehicles are equals if they have the same weight.   // done
    //  DO NOT override the methods from
    //  Steerable Interface in this class                   // done
    //
    // Car class: Car class extends Vehicle class           // done
    //  Overrides:
    //      accelerate() System.out.println("fire pistons, turn wheels");   // done
    //      steerLeft()  System.out.println("turn wheels left");            // done
    //      steerRight() System.out.println("turn wheels right");           // done
    //      toString()                                                      // done
    //
    // Boat class: Boat class extends Vehicle Class                         // done
    //  Overrides:
    //      accelerate() System.out.println("jet water");                   // done
    //      steerLeft()  System.out.println("turn tiller left");            // done
    //      steerRight() System.out.println("turn tiller right");           // done
    //      toString()                                                      // done
    //
    // Driver class:
    //  Contain the main method
    //  ArrayList of Vehicle as an instance variable
    //  Add three car objects and three boat objects in the ArrayList
    //  Print all the objects in the ArrayList
    //  In a different method go through the ArrayList and call the accelerate() method from each object.
    //
    // DO NOT implement everything in the main method.
    // DO NOT make the methods/attributes static.
    // Only the main method should be static.
    // Create methods for specific tasks such as addVehicle, print, etc.
}
