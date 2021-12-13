package toyproduct.models;

import toyproduct.Toy;

public class HelicopterToy implements Toy{
    private final int serialNumber;

    public HelicopterToy(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override    
    public void pack(){
        System.out.println("The helicopter " + this.serialNumber + " is being packing");
    }
    
    @Override  
    public void label(){
        System.out.println("The helicopter " + this.serialNumber + " is being labeling");
    }
    
}
