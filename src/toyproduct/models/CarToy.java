package toyproduct.models;

import toyproduct.Toy;

public class CarToy implements Toy{
    private final int serialNumber;
    
    public CarToy(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override  
    public void pack(){
        System.out.println("The car " + this.serialNumber + " is being packing");
    }
    
    @Override  
    public void label(){
        System.out.println("The car " + this.serialNumber + " is being labeling");
    }
}
