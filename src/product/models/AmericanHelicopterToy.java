package product.models;

import toyproduct.Toy;

public class AmericanHelicopterToy implements Toy {
    private final int num; 
    private final String type;
    
    public AmericanHelicopterToy(int num) {
        this.num = num;
        this.type = "American Helicopter";
    }

    @Override    
    public void pack(){
        System.out.println("The American helicopter " + this.num + " is being packing");
    }
    
    @Override  
    public void label(){
        System.out.println("The American helicopter " + this.num + " is being labeling");
    }
    
}
