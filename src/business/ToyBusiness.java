package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;

public class ToyBusiness {
    
    private final Map<String, ToyFactory> toyFactories = new HashMap<>();
    private final SerialNumberGenerator num = new SerialNumberGenerator();
    
    public Toy produceToy(String type){
        return toyFactories.get(type).produceToy(num.next());
    }
    
    public void add(String type, ToyFactory toyFactory){
        toyFactories.put(type, toyFactory);
    }
}
