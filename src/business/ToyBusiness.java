package business;

import toyproduct.Toy;

public abstract class ToyBusiness {
    
    protected final SerialNumberGenerator num = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
}
