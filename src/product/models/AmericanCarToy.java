package product.models;

import toyproduct.Toy;

public class AmericanCarToy implements Toy{
    private final int num;
    private final String type;
    
    public AmericanCarToy(int num) {
        this.num = num;
        this.type = "American Car";
    }
    
    @Override    
    public void pack(){
        System.out.println("The American car " + this.num + " is being packing");
    }
    
    @Override  
    public void label(){
        System.out.println("The American car " + this.num + " is being labeling");
    }
    
}
