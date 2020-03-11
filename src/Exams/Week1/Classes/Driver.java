package Exams.Week1.Classes;

public class Driver {
    public static void main(String[] args) {
        /**
         * Create a class called ‘Rectangle’ that has width, height and color as fields.
         * -	Width has to be greater than 0 and it is an integer. (otherwise set the width to 1)	                // DONE
         * -	Height has to be greater than 0 and it is an integer. (otherwise set the height to 1)	            // DONE
         * -	Color has to be Capitalized and more than 2 characters long and less than 20.			            // DONE
         * -	Default color is “Blue” (String)									                                // DONE
         * -	You should be able to create a rectangle with its width and height 					                // DONE
         * -	You should be able to create a rectangle with its width, height and color 				            // DONE
         * -	You should be able to use draw() method to display a rectangle with the first letter of the color.  // DONE
         * -	All your data has to be private and has getters/setters						                        // DONE
         * -	In your Driver class, create 3 rectangles with different sizes.					                    // DONE
         * -	r1 = Width: 5, Height: 7, Color: Blue								                                // DONE
         * -	r2 = Width: 10, Height: 2, Color: Green							                                    // DONE
         * -	r3 = Width: 15, Height: 12, Color: Red							                                    // DONE
         * -	Calling r1.draw(); will print the following.								                        // DONE
         * BBBBB
         * BBBBB
         * BBBBB
         * BBBBB
         * BBBBB
         * BBBBB
         * BBBBB
         */
        Rectangle r1 = new Rectangle(5,7,"Blue");
        r1.Draw(); System.out.println("");
        Rectangle r2 = new Rectangle(10,2,"Green");
        r2.Draw(); System.out.println("");
        Rectangle r3 = new Rectangle(15,12,"Red");
        r3.Draw();
    }
}