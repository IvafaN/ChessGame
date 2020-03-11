package MidTermExam;

public class Car extends Vehicle{
    public Car(int weightPounds) {
        super(weightPounds);
    }

    @Override public void accelerate() {
        System.out.println("fire pistons, turn wheels");
    }
    @Override public void steerLeft() {
        System.out.println("turn wheels left");
    }
    @Override public void steerRight() {
        System.out.println("turn wheels right");
    }
    @Override public String toString() {
        return "Car{Weight Pounds='" + getWeightPounds() + '\'' + '}';
    }
}