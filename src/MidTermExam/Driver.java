package MidTermExam;
import java.util.ArrayList;

public class Driver {
    // @ Autor JOSE HERMILO ORTEGA MARTINEZ
    public ArrayList<Vehicle> Vehicles = new ArrayList<>();
    public void addVehicle(String type, int weightPounds){
        if (type.equals("car")){ Vehicles.add(new Car(1)); }
        else                   { Vehicles.add(new Boat(1)); }
    }
    public void printVehicles(){
        for (Vehicle vehicle: Vehicles) {
            System.out.println(vehicle.toString());
        }
    }
    public void accelerateVehicles(){
        for (Vehicle vehicle: Vehicles) {
            vehicle.accelerate();
        }
    }
    public static void main(String[] args) {
        Driver d = new Driver();
        d.addVehicle("car", 1);
        d.addVehicle("car", 2);
        d.addVehicle("car", 3);

        d.addVehicle("boat", 4);
        d.addVehicle("boat", 5);
        d.addVehicle("boat", 6);

        d.printVehicles();
        d.accelerateVehicles();
    }
}