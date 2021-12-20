package product.models;

import toyproduct.Toy;

public class AsianCarToy implements Toy{
    private final int num;
    private final String type;
    
    public AsianCarToy(int num) {
        this.num = num;
        this.type = "Asian Car";
    }
    
    @Override    
    public void pack(){
        System.out.println("The Asian car " + this.num + " is being packing");
    }
    
    @Override  
    public void label(){
        System.out.println("The Asian car " + this.num + " is being labeling");
    }
}
