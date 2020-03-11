package Exams.Week1.Classes;

public class Rectangle {
    // fields
    private int width;
    private int height;
    private String color;

    Rectangle(int width, int height){
        if (width <= 0)
            this.width = 1;
        else
            this.width = width;
        if (height <= 0)
            this.height = 1;
        else
            this.height = height;
    }
    Rectangle(int width, int height, String color){
        if (width <= 0)
            this.width = 1;
        else
            this.width = width;
        if (height <= 0)
            this.height = 1;
        else
            this.height = height;
        if(color.length()>2 && color.length()<20)
            this.color = color.toUpperCase();
        else
            this.color = "Blue";
    }
    void Draw(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf(color.substring(0,1));
            }
            System.out.println();
        }
    }
}