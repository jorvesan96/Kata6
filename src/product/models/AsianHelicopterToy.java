package product.models;

import toyproduct.Toy;

public class AsianHelicopterToy implements Toy{
    private final int num;
    private final String type;
    
    public AsianHelicopterToy(int num) {
        this.num = num;
        this.type = "Asian Helicopter";
    }
    
    @Override    
    public void pack(){
        System.out.println("The Asian helicopter " + this.num + " is being packing");
    }
    
    @Override  
    public void label(){
        System.out.println("The Asian helicopter " + this.num + " is being labeling");
    }
    
}
