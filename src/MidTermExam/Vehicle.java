package MidTermExam;

abstract class Vehicle implements Steerable {
    private int weightPounds;

    public Vehicle(int weightPounds) {
        setWeightPounds(weightPounds);
    }
    public void setWeightPounds(int weightPounds) {
        this.weightPounds = (weightPounds<0)?0:weightPounds;
    }
    public int getWeightPounds() {
        return weightPounds;
    }
    public void hashcode(){

    }
    public boolean equal(Vehicle newVehicle){
        return (this.weightPounds == newVehicle.weightPounds);
    }
    public abstract String toString();
}