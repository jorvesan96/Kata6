package toys;

public class Car {
    private final int serialNumber;
    private final String type;
    
    public Car(int serialNumber) {
        this.serialNumber = serialNumber;
        type = "car";
    }
    
    public void pack(){
        System.out.println("The car " + this.serialNumber + " is being packing");
    }
    
    public void label(){
        System.out.println("The car " + this.serialNumber + " is being labeling");
    }
}
