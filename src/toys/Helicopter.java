package toys;

public class Helicopter {
    private final int serialNumber;
    private String type;

    public Helicopter(int serialNumber) {
        this.serialNumber = serialNumber;
        type="helicopter";
    }
    
    public void pack(){
        System.out.println("The helicopter " + this.serialNumber + " is being packing");
    }
    
    public void label(){
        System.out.println("The helicopter " + this.serialNumber + " is being labeling");
    }
    
}
